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
public class JsonView implements IActionView {

    private final Object data;
    private int statusCode = 200;

    public JsonView(Object data) {
        this.data = data;
    }

    public JsonView(Object data, int statusCode) {
        this.data = data;
        this.statusCode = statusCode;
    }

    public Object getData() {
        return data;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

}
