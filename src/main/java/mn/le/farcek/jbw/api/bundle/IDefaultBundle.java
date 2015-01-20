/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.bundle;

import java.io.InputStream;
import mn.le.farcek.jbw.api.IBundle;
import mn.le.farcek.jbw.api.exception.MissingAsset;

/**
 *
 * @author Farcek
 */
public interface IDefaultBundle extends IBundle {

    InputStream getAssetOverrideReader(String assetPath) throws MissingAsset;
}
