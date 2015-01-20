/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action;

import java.util.Enumeration;


/**
 *
 * @author Farcek
 */
public interface IRequestHeader {

    public int getIntHeader(String name);

    public Enumeration<String> getHeaderNames();

    public Enumeration<String> getHeaders(String name);

    public String getHeader(String name);

    public long getDateHeader(String name);

    public String getContentType();

}
