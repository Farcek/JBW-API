/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.http.request;

/**
 *
 * @author Farcek
 */
public interface HttpMapParam extends HttpParam {

    public HttpParam getParam(String key);

    HttpMapParam getMap(String key);

    HttpStringParam getString(String key);

    HttpCollectionParam getCollection(String key);

}
