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
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.escoglobal.miritlpatient.MainActivity;
import com.escoglobal.miritlpatient.R;

/**
 * Created by nathaniel.gonzales on 11/23/2016.
 */

public class processfour extends Activity {

    LinearLayout btnNext, btnPrev, btnHome;
    ImageView btnNext1, btnPrev1, btnHome1, imgImplantation;
    TextView btnNext2, btnPrev2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.ivfprocessfour_layout);

        btnNext1 = (ImageView) findViewById(R.id.btnpfourNext1);
        btnNext2 = (TextView) findViewById(R.id.btnpfourNext2);
        btnPrev1 = (ImageView) findViewById(R.id.btnpfourPrevious1);
        btnPrev2 = (TextView) findViewById(R.id.btnpfourPrevious2);
        btnHome1 = (ImageView) findViewById(R.id.btnpfourhome1);

        imgImplantation = (ImageView) findViewById(R.id.imgImplantation);
        RotateAnimation anim = new RotateAnimation(0.0f, 360.0f, android.view.animation.Animation.RELATIVE_TO_SELF,
                0.5f,android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f);

        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(android.view.animation.Animation.ABSOLUTE);
        anim.setDuration(700);
        imgImplantation.startAnimation(anim);

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processfour.this, processfive.class);
                startActivity(i);
            }
        });

        btnPrev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processfour.this, processthree.class);
                startActivity(i);
            }
        });

        btnHome1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnHome1.setBackgroundResource(R.drawable.ivffourhome_pressed);
                return false;
            }
        });

        btnHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHome1.setBackgroundResource(R.drawable.ivffourhome_pressed);
                Intent i = new Intent(processfour.this, MainActivity.class);
                startActivity(i);
            }
        });
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processfour.this, processfive.class);
                startActivity(i);
            }
        });

        btnPrev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processfour.this, processthree.class);
                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(processfour.this);
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
