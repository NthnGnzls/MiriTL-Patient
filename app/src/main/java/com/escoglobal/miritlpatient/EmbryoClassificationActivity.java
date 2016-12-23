package com.escoglobal.miritlpatient;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by nathaniel.gonzales on 11/28/2016.
 */

public class EmbryoClassificationActivity extends Activity {

    ImageButton btnNext2, btnHome2;
    TextView btnNext1;
    VideoView vid,vid2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.embryoclassification_layout);

        btnNext1 = (TextView) findViewById(R.id.btnECNext1);
        btnNext2 = (ImageButton) findViewById(R.id.btnECNext2);
        btnHome2 = (ImageButton) findViewById(R.id.btnECHome2);

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmbryoClassificationActivity.this, EmbryoCtwo.class);
                startActivity(i);
            }
        });

        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmbryoClassificationActivity.this, EmbryoCtwo.class);
                startActivity(i);
            }
        });

        btnHome2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHome2.setBackgroundResource(R.drawable.ivffivehome_pressed);
                Intent i = new Intent(EmbryoClassificationActivity.this, MainActivity.class);
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

        vid = (VideoView) findViewById(R.id.embryoVidDirect);
        vid2 = (VideoView) findViewById(R.id.embryoVid2Chaos);
        String vidname = "direct";
        String packagename = "com.escoglobal.miritlpatient";
        Uri vidUri = Uri.parse("android.resource://"+packagename+"/raw/"+vidname);
        vid.setVideoURI(vidUri);
        MediaController mc = new MediaController(EmbryoClassificationActivity.this);
        mc.setAnchorView(vid);
        mc.setMediaPlayer(vid);
        vid.setMediaController(mc);
        vid.requestFocus();
        vid.setZOrderOnTop(true);
        vid.start();


        String vidname2 = "chaos";
        String packagename2 = "com.escoglobal.miritlpatient";
        Uri vidUri2 = Uri.parse("android.resource://"+packagename2+"/raw/"+vidname2);
        vid2.setVideoURI(vidUri2);
        MediaController mc2 = new MediaController(EmbryoClassificationActivity.this);
        mc2.setAnchorView(vid2);
        mc2.setMediaPlayer(vid2);
        vid2.setMediaController(mc2);
        vid2.requestFocus();
        vid2.setZOrderOnTop(true);
        vid2.start();
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(EmbryoClassificationActivity.this);
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
