/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action;

import java.util.Collection;


/**
 *
 * @author Farcek
 */
public interface IResponseHeader{

    public Collection<String> getHeaderNames();

    public Collection<String> getHeaders(String name);

    public String getHeader(String name);

    public void addIntHeader(String name, int value);

    public void setIntHeader(String name, int value);

    public void addHeader(String name, String value);

    public void setHeader(String name, String value);

    public void addDateHeader(String name, long date);

    public boolean containsHeader(String name);

    public void setContentType(String type);
    
    public void setStatus(int code);

    public String getContentType();
    
    public void setCharacterEncoding(String charset);

}
