package org.example;

/* Source of example:
https://bigdatanerd.wordpress.com/2011/09/19/hello-world-java-annotations/
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface FirstAnnotation {


}
