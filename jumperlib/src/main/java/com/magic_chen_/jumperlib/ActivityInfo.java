package com.magic_chen_.jumperlib;
import android.app.Activity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by magic_chen_ on 2018/8/29.
 * email:chenyouya@leigod.com
 * project:BoheAccelerator_Android
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityInfo {
    Class<? extends Activity> clz() default Activity.class;
}
