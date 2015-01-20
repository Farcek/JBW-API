/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.managers;

import mn.le.farcek.jbw.api.IBundle;
import mn.le.farcek.jbw.api.bundle.IDefaultBundle;
import mn.le.farcek.jbw.api.exception.MissingBundle;

/**
 *
 * @author Farcek
 */
public interface IManager {

    IBundleManager getBundleManager(String name) throws MissingBundle;

    IDefaultBundle getDefaultBundle() throws MissingBundle;

}
