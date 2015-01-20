/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api;

import java.io.InputStream;
import java.util.List;
import mn.le.farcek.jbw.api.exception.MissingAsset;

/**
 *
 * @author Farcek
 */
public interface IBundle {
    
    List<Class<?>> getControllers();
    
    InputStream getAssetReaderStream(String assetPath)throws MissingAsset;
    
    
    
}
