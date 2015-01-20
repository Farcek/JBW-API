/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.bundle;

import com.mitchellbosecke.pebble.extension.Extension;
import java.util.List;

/**
 *
 * @author Farcek
 */
public interface PebbleExtensionFactory {

    List<Extension> getExtensions();
}
