package com.escoglobal.miritlpatient.ivfprocess;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import  android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.escoglobal.miritlpatient.MainActivity;
import com.escoglobal.miritlpatient.R;

import static android.R.attr.pivotX;
import static android.R.attr.pivotY;
import static android.R.style.Animation;

/**
 * Created by nathaniel.gonzales on 11/23/2016.
 */

public class processtwo extends Activity {
    ImageButton home1,next1,previous1;
    TextView home2,next2,previous2;
    Animation slide,slide2,an;
    ImageView vitro,intra,eggsperm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.ivfprocesstwo_layout);

        home1 = (ImageButton) findViewById(R.id.btnptwohome1);
        next1 = (ImageButton) findViewById(R.id.btnptwoNext1);
        next2 = (TextView) findViewById(R.id.btnptwoNext2);
        previous1 = (ImageButton) findViewById(R.id.btnptwoPrevious1);
        previous2 = (TextView) findViewById(R.id.btnptwoPrevious2);
        vitro = (ImageView) findViewById(R.id.imgVitro);
        intra = (ImageView) findViewById(R.id.imgIntra);
        eggsperm = (ImageView) findViewById(R.id.imgEggSperm);
        //0f, 350f, 15f, 15f
        RotateAnimation anim = new RotateAnimation(0.0f, 360.0f, android.view.animation.Animation.RELATIVE_TO_SELF,
                0.5f,android.view.animation.Animation.RELATIVE_TO_SELF, 0.5f);

        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(android.view.animation.Animation.ABSOLUTE);
        anim.setDuration(700);

        eggsperm.startAnimation(anim);
       // eggsperm.setAnimation(null);

        slide = AnimationUtils.loadAnimation(this, R.anim.slide);
        slide2 = AnimationUtils.loadAnimation(this, R.anim.slide2);

        home1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                home1.setBackgroundResource(R.drawable.ivftwohome_pressed);
                return false;
            }
        });
        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home1.setBackgroundResource(R.drawable.ivftwohome_pressed);
                Intent i = new Intent(processtwo.this, MainActivity.class);
                startActivity(i);
            }
        });
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processtwo.this, processthree.class);
                startActivity(i);
            }
        });

        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processtwo.this, processthree.class);
                startActivity(i);
            }
        });

        previous1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processtwo.this, processone.class);
                startActivity(i);
            }
        });

        previous2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processtwo.this, processone.class);
                startActivity(i);
            }
        });

        vitro.startAnimation(slide);
        intra.startAnimation(slide2);
        //eggsperm.startAnimation(an);

    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(processtwo.this);
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
