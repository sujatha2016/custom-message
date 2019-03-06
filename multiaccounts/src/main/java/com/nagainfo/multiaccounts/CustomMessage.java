package com.nagainfo.multiaccounts;

import android.content.Context;
import android.widget.Toast;

public class CustomMessage {

    public static void showMessage(Context context, String message, int duration){

        Toast.makeText(context, message, duration).show();

    }

}
