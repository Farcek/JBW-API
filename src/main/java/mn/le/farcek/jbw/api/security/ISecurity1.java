/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.security;




/**
 *
 * @author Farcek
 */
public interface ISecurity1 {
    IUser getCurrentUser();
    
    boolean hasAccess(String role);
    boolean hasRole(String role);
}
