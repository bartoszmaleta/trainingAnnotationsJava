package org.example.jenkovExample;

import java.lang.annotation.*;

//@Target(ElementType.FIELD)
//@Inherited
//@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String name() default "BartoszM";
    int count() default 27;
    String[] tags() default {"code", "programming", "language"};
    String description() default "No description";
}
