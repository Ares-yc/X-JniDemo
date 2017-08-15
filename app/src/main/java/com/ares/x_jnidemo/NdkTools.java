package com.ares.x_jnidemo;

/**
 * ====================================
 * 作    者：Ares(颜崔)
 * 地    址：https://github.com/Ares-yc
 * 描    述：
 * 版    本：1.0.0
 * 创建时间：2017/8/15/015.
 * 修改时间：2017/8/15/015.
 * ====================================
 */

public class NdkTools {

    static {
        System.loadLibrary("NdkTools");
    }

    public static native String getString();
}
