/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.http.request;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Logger;

/**
 *
 * @author Farcek
 */
public class HttpRequestBuilder {

    public static Logger LOGGER;
    private final HttpRequestImpl requestImpl = new HttpRequestImpl();

    public static HttpRequest build(Map<String, String> map) {
        HttpRequestBuilder builder = new HttpRequestBuilder();
        for (Map.Entry<String, String> entrySet : map.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            builder.add(key, value);
        }
        return builder.requestImpl;
    }

    public static HttpParam buildStringParam(String... value) {
        if (value == null) {
            return null;
        }
        int n = value.length;
        if (n == 0) {
            return null;
        }
        if (n == 1) {
            return buildStringParam(value[0]);
        }

        return buildCollectionParam(value);
    }

    public static HttpStringParam buildStringParam(String value) {
        return new HttpStringParamImpl(value);
    }

    public static HttpCollectionParam buildCollectionParam(String... values) {
        HttpCollectionParamImpl collectionParam = new HttpCollectionParamImpl();
        for (int i = 0; i < values.length; i++) {
            collectionParam.params.put(i, new HttpStringParamImpl(values[i]));
        }
        return collectionParam;
    }

    private void add(String key, String value) {
        if (key == null) {
            return;
        }

        boolean matches = key.matches("^\\w+((\\.\\w+|(\\[\\d+\\])+)+)?");
        if (matches == false) {
            if (LOGGER != null) {
                LOGGER.warning(String.format("ignored `%s` the key. because is key is invalid. requared regex:^\\w+((\\.\\w+|(\\[\\d+\\])+)+)?", key));
            }
            return;
        }

        StringTokenizer st1 = new StringTokenizer(key, ".[]");
        List<String> keys = new ArrayList<>();
        while (st1.hasMoreTokens()) {
            keys.add(st1.nextToken());
        }

        System.out.println("keys->" + keys);

        ListIterator<String> kk = keys.listIterator();

        HttpParam p = requestImpl;

        while (kk.hasNext()) {
            String k1 = kk.next();
            if (kk.hasNext()) {
                HttpParam nParam = null;
                if (p instanceof HttpMapParamImpl) {
                    nParam = ((HttpMapParamImpl) p).getParam(k1);
                } else if (p instanceof HttpCollectionParamImpl) {
                    nParam = ((HttpCollectionParamImpl) p).getParam(Integer.valueOf(k1));
                }

                if (nParam == null) {
                    String k2 = kk.next();
                    if (k2.matches("\\d+")) {
                        nParam = new HttpCollectionParamImpl();
                    } else {
                        nParam = new HttpMapParamImpl();
                    }

                    if (p instanceof HttpMapParamImpl) {
                        ((HttpMapParamImpl) p).put(k1, nParam);
                    } else if (p instanceof HttpCollectionParamImpl && k1.matches("\\d+")) {
                        ((HttpCollectionParamImpl) p).put(Integer.valueOf(k1), nParam);
                    } else {
                        if (LOGGER != null) {
                            LOGGER.warning(String.format("ignored `%s` the key. `%s` tulhuur-n aguulagch ni HttpMapParam esvel HttpCollectionParam baih estoi", key, k1));
                        }
                        return;
                    }
                    kk.previous();
                }
                p = nParam;

            } else {
                HttpStringParamImpl stringParamImpl = new HttpStringParamImpl(value);
                if (p instanceof HttpMapParamImpl) {
                    ((HttpMapParamImpl) p).put(k1, stringParamImpl);
                } else if (p instanceof HttpCollectionParamImpl && k1.matches("\\d+")) {
                    ((HttpCollectionParamImpl) p).put(Integer.valueOf(k1), stringParamImpl);

                } else {
                    if (LOGGER != null) {
                        LOGGER.warning(String.format("ignored `%s` the key. `%s` tulhuur-n aguulagch ni HttpMapParam esvel HttpCollectionParam baih estoi", key, k1));
                    }
                    return;
                }
            }
        }

    }

    static class HttpMapParamImpl implements HttpMapParam {

        final Map<String, HttpParam> params = new HashMap<>();

        void put(String key, HttpParam param) {
            params.put(key, param);
        }

        @Override
        public HttpParam getParam(String name) {
            return params.get(name);
        }

        @Override
        public HttpMapParam getMap(String name) {
            HttpParam param = getParam(name);
            if (param instanceof HttpMapParam) {
                return (HttpMapParam) param;
            }
            return null;
        }

        @Override
        public HttpStringParam getString(String name) {
            HttpParam param = getParam(name);
            if (param instanceof HttpStringParam) {
                return (HttpStringParam) param;
            }
            return null;
        }

        @Override
        public HttpCollectionParam getCollection(String name) {
            HttpParam param = getParam(name);
            if (param instanceof HttpCollectionParam) {
                return (HttpCollectionParam) param;
            }
            return null;
        }

        @Override
        public String toString() {
            return "O" + params.toString();
        }
    }

    static class HttpRequestImpl extends HttpMapParamImpl implements HttpRequest {

    }

    static class HttpCollectionParamImpl implements HttpCollectionParam, Iterable<HttpParam> {

        final Map<Integer, HttpParam> params = new HashMap<>();

        public void put(Integer key, HttpParam param) {
            params.put(key, param);
        }

        @Override
        public HttpParam getParam(Integer index) {
            return params.get(index);
        }

        @Override
        public HttpMapParam getMap(Integer index) {
            HttpParam param = getParam(index);
            if (param instanceof HttpMapParam) {
                return (HttpMapParam) param;
            }
            return null;
        }

        @Override
        public HttpStringParam getString(Integer index) {
            HttpParam param = getParam(index);
            if (param instanceof HttpStringParam) {
                return (HttpStringParam) param;
            }
            return null;
        }

        @Override
        public HttpCollectionParam getCollection(Integer index) {
            HttpParam param = getParam(index);
            if (param instanceof HttpMapParam) {
                return (HttpCollectionParam) param;
            }
            return null;
        }

        @Override
        public String toString() {
            return "A" + params.toString();
        }

        @Override
        public Iterator<HttpParam> iterator() {
            return params.values().iterator();
        }

    }

    static class HttpStringParamImpl implements HttpStringParam {

        final String value;

        public HttpStringParamImpl(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }

    }
}
