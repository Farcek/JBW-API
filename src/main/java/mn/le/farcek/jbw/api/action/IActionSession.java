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
public interface IActionSession {

    public void invalidate();

    public void removeAttribute(String name);

    public void setAttribute(String name, Object value);

    public Enumeration<String> getAttributeNames();

    public Object getAttribute(String name);

    public String getId();

    public long getCreationTime();

}
