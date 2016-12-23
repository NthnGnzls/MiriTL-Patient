package com.escoglobal.miritlpatient;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

/**
 * Created by nathaniel.gonzales on 11/28/2016.
 */

public class EmbryoCtwo extends Activity {

    TextView btnBack1;
    ImageView btnBack2, btnHome2;
    VideoView vid1, vid2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.embryoctwo_layout);

        btnBack1 = (TextView) findViewById(R.id.btnECBack1);
        btnBack2 = (ImageView) findViewById(R.id.btnECBack2);
        btnHome2 = (ImageView) findViewById(R.id.btnECHometwo2);

        vid1 = (VideoView) findViewById(R.id.embryoVidMulti);
        String vidname = "multinuclation";
        String packagename = "com.escoglobal.miritlpatient";
        Uri vidUri = Uri.parse("android.resource://"+packagename+"/raw/"+vidname);
        vid1.setVideoURI(vidUri);
        MediaController mc = new MediaController(EmbryoCtwo.this);
        mc.setAnchorView(vid1);
        mc.setMediaPlayer(vid1);
        vid1.setMediaController(mc);
        vid1.requestFocus();
        vid1.setZOrderOnTop(true);
        vid1.start();

        vid2 = (VideoView) findViewById(R.id.embryoVid2Normal);
        String vidname2 = "normal";
        String packagename2 = "com.escoglobal.miritlpatient";
        Uri vidUri2 = Uri.parse("android.resource://"+packagename2+"/raw/"+vidname2);
        vid2.setVideoURI(vidUri);
        MediaController mc2 = new MediaController(EmbryoCtwo.this);
        mc.setAnchorView(vid2);
        mc.setMediaPlayer(vid2);
        vid2.setMediaController(mc2);
        vid2.requestFocus();
        vid2.setZOrderOnTop(true);
        vid2.start();

        btnBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmbryoCtwo.this, EmbryoClassificationActivity.class);
                startActivity(i);
            }
        });

        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmbryoCtwo.this, EmbryoClassificationActivity.class);
                startActivity(i);
            }
        });
        btnHome2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnHome2.setBackgroundResource(R.drawable.ivffivehome_pressed);
                return false;
            }
        });
        btnHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHome2.setBackgroundResource(R.drawable.ivffivehome_pressed);
                Intent i = new Intent(EmbryoCtwo.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(EmbryoCtwo.this);
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
