package com.escoglobal.miritlpatient.ivfprocess;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
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

import com.escoglobal.miritlpatient.MainActivity;
import com.escoglobal.miritlpatient.R;

/**
 * Created by nathaniel.gonzales on 11/23/2016.
 */

public class processfive extends Activity {

    ImageView btnPrev1, btnHome1, imgPregnancy;
    TextView btnPrev2, btnHome2;
    Animation slide;
    ImageButton home;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.ivfprocessfive_layout);

        btnPrev1 = (ImageView) findViewById(R.id.btnpfivePrevious1);
        btnPrev2 = (TextView) findViewById(R.id.btnpfivePrevious2);

        imgPregnancy = (ImageView) findViewById(R.id.imgPregnancy);
        home = (ImageButton) findViewById(R.id.btnfivehome1);

        slide = AnimationUtils.loadAnimation(this,R.anim.slide);
        btnPrev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processfive.this, processfour.class);
                startActivity(i);
            }
        });


        btnPrev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processfive.this, processfour.class);
                startActivity(i);
            }
        });

        home.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                home.setBackgroundResource(R.drawable.ivffivehome_pressed);
                return false;
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home.setBackgroundResource(R.drawable.ivffivehome_pressed);
                Intent i = new Intent(processfive.this, MainActivity.class);
                startActivity(i);
            }
        });

        imgPregnancy.startAnimation(slide);
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(processfive.this);
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
