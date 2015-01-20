/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.managers;

import java.io.IOException;
import java.io.Writer;
import mn.le.farcek.jbw.api.exception.CannotExecutAction;
import mn.le.farcek.jbw.api.exception.MissingAction;

/**
 *
 * @author Farcek
 */
public interface IControllerManager {
    String getName();
    Object getControllerObject();
    IBundleManager getBundleManager();
    public IActionManager getActionManager(String name) throws MissingAction;
}
