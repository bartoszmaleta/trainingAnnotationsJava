package org.example.jenkovExample;

public @interface CustomAnnotation {
    String name() default "BartoszM";
    int count() default 27;
    String[] tags() default {"code", "programming", "language"};
    String description() default "No description";
}
