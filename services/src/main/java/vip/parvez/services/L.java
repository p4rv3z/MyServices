package vip.parvez.services;

import android.util.Log;

public class L {
    private static final String TAG = "PARVEZ::: ";

    /**
     * <h>Print Log debugging message.</h>
     * If message is empty it will return "No Message Found!"
     *
     * @param msg
     */
    public static void d(String msg) {
        if (msg.isEmpty()) {
            msg = "No Message Found!";
        }
        Log.d(TAG, msg);
    }

    /**
     * <h>Print Log info message.</h>
     * If message is empty it will return "No Message Found!"
     *
     * @param msg
     */
    public static void i(String msg) {
        if (msg.isEmpty()) {
            msg = "No Message Found!";
        }
        Log.i(TAG, msg);
    }

    /**
     * <h>Print Log error message.</h>
     * If message is empty it will return "No Message Found!"
     *
     * @param msg
     */
    public static void e(String msg) {
        if (msg.isEmpty()) {
            msg = "No Message Found!";
        }
        Log.e(TAG, msg);
    }

    /**
     * <h>Print Log verbose message.</h>
     * If message is empty it will return "No Message Found!"
     *
     * @param msg
     */
    public static void v(String msg) {
        if (msg.isEmpty()) {
            msg = "No Message Found!";
        }
        Log.v(TAG, msg);
    }

    /**
     * <h>Print Log warn message.</h>
     * If message is empty it will return "No Message Found!"
     *
     * @param msg
     */
    public static void w(String msg) {
        if (msg.isEmpty()) {
            msg = "No Message Found!";
        }
        Log.w(TAG, msg);
    }

    /**
     * <h>Print Log wtf message.</h>
     * If message is empty it will return "No Message Found!"
     *
     * @param msg
     */
    public static void wtf(String msg) {
        if (msg.isEmpty()) {
            msg = "No Message Found!";
        }
        Log.wtf(TAG, msg);
    }
}