package com.escoglobal.miritlpatient.ivfprocess;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.escoglobal.miritlpatient.MainActivity;
import com.escoglobal.miritlpatient.R;

/**
 * Created by nathaniel.gonzales on 11/23/2016.
 */

public class processone extends Activity {

    ImageButton home,next2;
    TextView next1;
    ImageView sperm,egg,p1text;
    Animation pulse,zoomout,zoomin,fadein;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.ivfprocessone_layout);
        sperm = (ImageView) findViewById(R.id.imgSperm);
        egg = (ImageView) findViewById(R.id.imgEgg);
        home = (ImageButton) findViewById(R.id.btnponehome);
        egg = (ImageView) findViewById(R.id.imgEgg);
        next1 = (TextView) findViewById(R.id.btnponeNext1);
        next2 = (ImageButton) findViewById(R.id.btnponeNext2);
        p1text = (ImageView) findViewById(R.id.imgProcessOneText);


        pulse = AnimationUtils.loadAnimation(this, R.anim.pulse);
        zoomout = AnimationUtils.loadAnimation(this, R.anim.zoomout);
        zoomin = AnimationUtils.loadAnimation(this, R.anim.zoomin);
        fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);

        home.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                home.setBackgroundResource(R.drawable.ivfonehome_pressed);
                return false;
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home.setBackgroundResource(R.drawable.ivfonehome_pressed);
                Intent i = new Intent(processone.this, MainActivity.class);
                startActivity(i);
            }
        });
        egg = (ImageView) findViewById(R.id.imgEgg);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processone.this,processtwo.class);
                startActivity(i);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processone.this,processtwo.class);
                startActivity(i);
            }
        });

        sperm.startAnimation(pulse);
        egg.startAnimation(pulse);
        p1text.startAnimation(fadein);
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(processone.this);
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
