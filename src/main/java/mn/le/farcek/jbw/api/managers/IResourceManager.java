/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.managers;

import java.io.File;
import java.io.IOException;
import mn.le.farcek.jbw.api.action.IActionRequest;
import mn.le.farcek.jbw.api.action.IActionRequestPart;
import mn.le.farcek.jbw.api.exception.MissingResource;
import mn.le.farcek.jbw.api.resource.ResourceResult;

/**
 *
 * @author Farcek
 */
public interface IResourceManager {

    ResourceResult create(IActionRequest actionRequest,String partName) throws IOException;
    
    ResourceResult create(IActionRequestPart actionRequestPart) throws IOException;
    ResourceResult create(IActionRequestPart actionRequestPart,File dir) throws IOException;
    
    ResourceResult createTemp(IActionRequestPart actionRequestPart) throws IOException;
    ResourceResult createFromTemp(String resourceName) throws IOException;

    void remove(String resourceName);

    String resourceUrl(String resourceName);
    String resourceTempUrl(String resourceName);
    String imageUrl(String resourceName) throws MissingResource;

    String imageThumbnailUrl(String resourceName, int w, int h) throws MissingResource;
    File getThumbnailFile(String resourceName, int w, int h) throws MissingResource;
    
    
}
