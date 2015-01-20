/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.action;

import mn.le.farcek.jbw.api.security.IUser;

/**
 *
 * @author Farcek
 */
public interface IActionSecurity {
    IUser getCurrentUser();
    
    boolean hasAccess(String role);
    boolean hasRole(String role);
}
