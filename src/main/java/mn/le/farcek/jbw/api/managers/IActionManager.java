/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.managers;

import java.io.IOException;
import java.io.Writer;
import mn.le.farcek.jbw.api.action.IActionParamFactory;
import mn.le.farcek.jbw.api.action.IActionRequest;
import mn.le.farcek.jbw.api.action.IRequestHeader;
import mn.le.farcek.jbw.api.action.IResponseHeader;
import mn.le.farcek.jbw.api.exception.CannotExecutAction;

/**
 *
 * @author Farcek
 */
public interface IActionManager {

    public String getName();

    public IControllerManager getControllerManager();

    public void executAction(Writer writer, IActionParamFactory actionParamFactory) throws CannotExecutAction, IOException;
}
