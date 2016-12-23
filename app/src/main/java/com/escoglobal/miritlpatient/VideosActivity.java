package com.escoglobal.miritlpatient;

import android.app.Activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;


/**
 * Created by nathaniel.gonzales on 12/1/2016.
 */

public class VideosActivity extends Activity {


    @Override
    public void onCreate(Bundle saveInstanceSate){
        super.onCreate(saveInstanceSate);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //setContentView(R.layout.activity_main);
        Intent i = new Intent (VideosActivity.this, MainActivity.class);
        startActivity(i);
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.chromeremotedesktop");
        if (intent != null) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else {
            Toast.makeText(VideosActivity.this, "You must first install the Chrome Remote Desktop to proceed", Toast.LENGTH_LONG).show();
            intent = new Intent(Intent.ACTION_VIEW);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.setData(Uri.parse("market://details?id=" + "com.google.chromeremotedesktop"));
            startActivity(intent);
        }
    }

}
