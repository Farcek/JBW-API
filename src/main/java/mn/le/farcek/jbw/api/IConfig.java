/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api;

import java.io.File;
import java.util.List;
import java.util.Locale;
import mn.le.farcek.jbw.api.bundle.IDefaultBundle;
import mn.le.farcek.jbw.api.security.SecurityRole;

/**
 *
 * @author Farcek
 */
public interface IConfig {

    public String getConfigDir();

    public String getWebDomain();
    public String getContextPath();

    public String getApplicationKey();

    public String getSecureToken();

    public boolean isDebug();

    public boolean isTemplateCache();

    public String getPathOfBundleHandler();

    public String getPathOfAssetHandler();

    public String getPathOfResourceHandler();
    public String getPathOfImageResourceHandler();

    public File getDirOfResource();
    public String getTempDirName();
    public File getTempDirOfResource();

    //public IMailServerConfig getMailServiceConfig();
    public SecurityRole getSecurityRole();
    public Locale getDefaultLocale();

    public List<Class<? extends IBundle>> getBundles();

    public Class<? extends IDefaultBundle> getDefaultBundle();

    public String getLoginPage();
    public String getBuildVersion();

}
