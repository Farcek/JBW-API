/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action.view;

import mn.le.farcek.jbw.api.action.IActionView;

/**
 *
 * @author Farcek
 */
public final class RedirectView implements IActionView {

    private final String url;
    private int statusCode =302;

    public RedirectView(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

   
    

}
