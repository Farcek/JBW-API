/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Method param support objects IActionRequest IActionRequestPart
 * IActionSecurity IActionSession IRequestHeader IResponseHeader
 *
 * @author Farcek
 */
@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Action {

    public String name() default "";

    public String view() default "";

    public boolean member() default false;

    public String role() default "";

    public String result() default "html";

}
