package org.example.jenkovExample;

@MyAnnotation
public @interface BasicAnnotationExamples {

    @MyAnnotation
    private String name = "MyName";

    @MyAnnotation
    public BasicAnnotationExamples() {

    }

    public void printText(@MyAnnotation String text) {
        @MyAnnotation String localar = "Some Text";
    }

    @MyAnnotation
    public static void main(@MyAnnotation String[] args) {

    }


}
