/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.http.request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Logger;

/**
 *
 * @author Farcek
 */
public class test {
    public static void main(String[] args) {
        HttpRequestBuilder.LOGGER = Logger.getLogger("test");
        Map<String,String> p = new HashMap<>();
        p.put("name", "farcek");
        p.put("d[]age", "11");
        p.put("a[1]", "1");
        p.put("a[2]", "2");
        p.put("a[3]", "3");
        p.put("b.a", "4");
        p.put("b.b", "5");
        p.put("b.c", "6");
        p.put("n.m[1]", "7");
        p.put("n.m[2]", "8");
        p.put("n.m", "9");
        
        p.put("k.m[1][1]", "7");
        p.put("k.m[1][2]", "8");
        p.put("k.m[3].c", "9");
        p.put("t[1].a", "1");
        p.put("t.1.b", "2");
        p.put("t.1.c", "3");
        HttpRequest r = HttpRequestBuilder.build(p);
        System.out.println(r);
        
        
        
    }
    
    public static void v(String v) {
        
        System.out.println("-----------"+v);
        StringTokenizer st= new StringTokenizer(v,".[]");
        System.out.println("--"+st.nextToken());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
