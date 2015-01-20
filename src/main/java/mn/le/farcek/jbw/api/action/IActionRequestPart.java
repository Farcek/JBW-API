/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import javax.servlet.http.Part;

/**
 *
 * @author Farcek
 */
public interface IActionRequestPart {

    public Collection<String> getHeaderNames();

    public Collection<String> getHeaders(String name);

    public String getHeader(String name);

    public void delete() throws IOException;

    public void write(String fileName) throws IOException;

    public long getSize();

    public String getSubmittedFileName();

    public String getName();

    public String getContentType();

    public InputStream getInputStream() throws IOException;
    
}
