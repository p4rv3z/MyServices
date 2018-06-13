package vip.parvez.services;

import android.content.Context;
import android.widget.Toast;

public class S {

    /**
     * <h1>Toast message show</h1>
     * If message is empty it will show "No Message Found!"
     *
     * @param context
     * @param msg
     */
    public static void Toast(Context context, String msg) {
        if (msg.isEmpty()) {
            msg = "No Message Found!";
        }
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
        L.d("Toast print- " + msg);
    }
}
