package app;

import elemental2.core.JsArray;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative = true, name="process", namespace = GLOBAL)
public class Process {


    @JsProperty(name="argv")
    public static native JsArray<String> getArgv();


    @JsMethod(name="hrtime")
    public static native JsArray<Integer> hrtime();

}
