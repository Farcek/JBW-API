/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.managers;

/**
 *
 * @author Farcek
 */
public interface IUrlBuilder {

    
    
    public String buildBundle(String href, Mode mode);
    public String buildResource(String name, Mode mode);
    public String buildResourceImage(String name, Mode mode);
    public String buildResourceImage(String name, Mode mode, int w, int h);
    public String buildAsset(String asset, String path, Mode mode);
    
    

    public enum Mode {

        FULL, SHORT;
    }
}
