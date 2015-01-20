/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.resource;

import java.io.File;

/**
 *
 * @author Farcek
 */
public class ResourceResult {

    private final File dir;
    private final String fileName;
    private final String resourceName;

    public ResourceResult(File dir, String fileName, String resourceName) {
        this.dir = dir;
        this.fileName = fileName;
        this.resourceName = resourceName;
    }

    public File getDir() {
        return dir;
    }

    

    public String getFileName() {
        return fileName;
    }

    public String getResourceName() {
        return resourceName;
    }

    @Override
    public String toString() {
        return "ResourceResult{" + "fileName=" + fileName + ", resourceName=" + resourceName + '}';
    }
}
