/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action.view;

import java.util.HashMap;
import java.util.Map;
import mn.le.farcek.jbw.api.action.IActionView;

/**
 *
 * @author Farcek
 */
public class HtmlView implements IActionView {

    private String name;
    private int statusCode =200;
    private final Map<String, Object> params;

    public HtmlView() {
        params = new HashMap<>();
    }

    public HtmlView(String name, Map<String, Object> params) {
        this.name = name;
        this.params = params;
    }

    public HtmlView(String name) {
        this.name = name;
        params = new HashMap<>();
    }

    public HtmlView(Map<String, Object> params) {
        this.params = params;
    }

    public String getName() {
        return name;
    }

    public HtmlView setName(String name) {
        this.name = name;
        return this;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public HtmlView add(String name, Object value) {
        params.put(name, value);
        return this;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    
    @Override
    public String toString() {
        return "HtmlView{" + "name=" + name + ", params=" + params + '}';
    }
    
    

}
