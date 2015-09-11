package com.tommyjepsen.tcore.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.tommyjepsen.tcore.R;

/**
 * Created by tommyjepsen on 11/09/15.
 */
public class TToast {

    private static final String TAG = TToast.class.getName();

    public TToast() {
    }

    /**
     * @param context
     * @param msg
     * @param imageResource
     */
    public static void create(Context context, String msg, Drawable imageResource) {
        if (context != null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.toast, null);

            LinearLayout layoutLl = (LinearLayout) layout.findViewById(R.id.toast_layout);

            ImageView image = (ImageView) layout.findViewById(R.id.toast_image);
            image.setImageDrawable(imageResource);
            image.setVisibility(View.VISIBLE);

            TextView text = (TextView) layout.findViewById(R.id.toast_text);
            text.setText(msg);

            Toast toast = new Toast(context);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layoutLl);
            toast.show();

        } else {
            TLog.d(TAG, "Couldn't find context");
        }

    }

    /**
     * @param context
     * @param msg
     */
    public static void create(Context context, String msg) {
        if (context != null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.toast, null);

            LinearLayout layoutLl = (LinearLayout) layout.findViewById(R.id.toast_layout);

            TextView text = (TextView) layout.findViewById(R.id.toast_text);
            text.setText(msg);

            Toast toast = new Toast(context);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layoutLl);
            toast.show();

        } else {
            TLog.d(TAG, "Couldn't find context");
        }

    }
}
