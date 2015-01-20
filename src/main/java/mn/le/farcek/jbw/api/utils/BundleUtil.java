/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.utils;

import mn.le.farcek.common.utils.FStringUtils;
import mn.le.farcek.jbw.api.Bundle;
import mn.le.farcek.jbw.api.Controller;
import mn.le.farcek.jbw.api.exception.MissingBundle;
import mn.le.farcek.jbw.api.exception.MissingController;

/**
 *
 * @author Farcek
 */
public class BundleUtil {

    public static String getBundleName(Class<?> cls) throws MissingBundle {
        Bundle ann = cls.getAnnotation(Bundle.class);
        if (ann == null) {
            throw new MissingBundle(String.format("`%s` class ni bundle class bish bna ", cls));
        }

        String name = ann.name();
        if (FStringUtils.isEmpty(name)) {
            name = FStringUtils.firstLower(cls.getSimpleName());
        }
        return name;
    }
    public static String getControllerName(Class<?> cls) throws MissingController {
        Controller ann = cls.getAnnotation(Controller.class);
        if (ann == null) {
            throw new MissingController(String.format("`%s` class ni controller class bish bna ", cls));
        }

        String name = ann.name();
        if (FStringUtils.isEmptyOrNull(name)) {
            name = FStringUtils.firstLower(cls.getSimpleName());
        }
        return name;
    }
}
