/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.managers;

import java.io.InputStream;
import mn.le.farcek.jbw.api.IBundle;
import mn.le.farcek.jbw.api.exception.MissingAsset;
import mn.le.farcek.jbw.api.exception.MissingController;

/**
 *
 * @author Farcek
 */
public interface IBundleManager {

    IBundle getBundle();

    String getName();

    IControllerManager getControllerManager(String name) throws MissingController;
    IControllerManager getDefaultControllerManager() throws MissingController;

    InputStream getAssetReaderStream(String assetPath) throws MissingAsset;
}
