package com.escoglobal.miritlpatient;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by nathaniel.gonzales on 15/12/2016.
 */

public class EmbryoTimeLapseActivity extends Activity{

    VideoView vid;
    ImageButton home;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.embryotimelapse_layout);

        home = (ImageButton) findViewById(R.id.btnECHome2);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home.setBackgroundResource(R.drawable.timelapse_pressed);
                Intent i = new Intent(EmbryoTimeLapseActivity.this, EmbryoIncubationActivity.class);
                startActivity(i);
            }
        });
        home.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                home.setBackgroundResource(R.drawable.timelapse_pressed);
                return false;
            }
        });

        vid = (VideoView) findViewById(R.id.tlvid);
        String vidname = "timelapsevid";
        String packagename = "com.escoglobal.miritlpatient";
        Uri vidUri = Uri.parse("android.resource://"+packagename+"/raw/"+vidname);
        vid.setVideoURI(vidUri);
        MediaController mc = new MediaController(EmbryoTimeLapseActivity.this);
        mc.setAnchorView(vid);
        mc.setMediaPlayer(vid);
        vid.setMediaController(mc);
        vid.requestFocus();
        vid.setZOrderOnTop(true);
        vid.start();
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(EmbryoTimeLapseActivity.this);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory( Intent.CATEGORY_HOME );
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        });
        builder.setNegativeButton("Cancel", null).setTitle("Do you really want to exit?");
        builder.show();
    }
}
