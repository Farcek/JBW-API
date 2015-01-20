/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.bundle;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import mn.le.farcek.jbw.api.Bundle;
import mn.le.farcek.jbw.api.IBundle;
import mn.le.farcek.jbw.api.exception.MissingAsset;
import mn.le.farcek.jbw.api.utils.BundleUtil;

/**
 *
 * @author Farcek
 */
public abstract class JBWBundle implements IBundle {

    protected Class getAssetReaderClass() {
        return this.getClass();
    }

    @Override
    public InputStream getAssetReaderStream(String assetPath) throws MissingAsset {
        Class cls = getAssetReaderClass();
        InputStream is = cls.getResourceAsStream(assetPath);
        if (is == null)
            throw new MissingAsset(String.format("can not reader `%s`. reader class= `%s`", assetPath, cls));
        return is;
    }

    private List<Class<?>> controllers;

    @Override
    public final List<Class<?>> getControllers() {
        if (controllers == null) {
            controllers = new ArrayList<>();

            Bundle bAnnotation = getClass().getAnnotation(Bundle.class);
            if (bAnnotation != null) {
                Class<?>[] defaultControllers = bAnnotation.defaultController();
                if (defaultControllers != null && defaultControllers.length > 0)
                    controllers.add(defaultControllers[0]);
            }

            setupControllers(controllers);
        }
        return controllers;
    }

    protected abstract void setupControllers(List<Class<?>> controllers);

}
