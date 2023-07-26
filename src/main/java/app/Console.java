package app;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative = true, name = "console", namespace = GLOBAL)
public class Console {

    @JsMethod(name="log")
    public static native void log(String text);
}
