/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.security;

import java.util.List;

/**
 *
 * @author Farcek
 */
public interface IUser {

    public String getName();
    public String getEmail();
    public List<String> getRoles();
    
}
