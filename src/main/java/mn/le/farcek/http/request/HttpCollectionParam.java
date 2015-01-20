/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.http.request;

public interface HttpCollectionParam extends HttpParam {

    public HttpParam getParam(Integer index);

    HttpMapParam getMap(Integer key);

    HttpStringParam getString(Integer key);

    HttpCollectionParam getCollection(Integer key);

}
