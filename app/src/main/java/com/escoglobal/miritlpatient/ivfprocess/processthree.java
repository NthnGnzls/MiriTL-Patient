package com.escoglobal.miritlpatient.ivfprocess;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
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

import com.escoglobal.miritlpatient.MainActivity;
import com.escoglobal.miritlpatient.R;

/**
 * Created by nathaniel.gonzales on 11/23/2016.
 */

public class processthree extends Activity {

    ImageButton btnNext1,btnPrev1,btnHome1;
    TextView btnNext2, btnPrev2;
    ImageView imgText, imgMiri,p1,p2,p3,p4,p5;
    Animation slide,slide2,pulse;
    LinearLayout lrFerEgg,lrTwoCell,lrFourCell,lrMorula,lrBlastula;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.ivfprocessthree_layout);

        btnNext1 = (ImageButton) findViewById(R.id.btnpthreeNext2);
        btnNext2 = (TextView) findViewById(R.id.btnpthreeNext1);
        btnPrev1 = (ImageButton) findViewById(R.id.btnpthreePrevious1);
        btnPrev2 = (TextView) findViewById(R.id.btnpthreePrevious2);
        btnHome1 = (ImageButton) findViewById(R.id.btnpthreehome1);
        imgMiri = (ImageView) findViewById(R.id.imgpthreeMiri);
        imgText = (ImageView) findViewById(R.id.imgpthreetext);

        p1 = (ImageView) findViewById(R.id.imgFerEgg);
        p2 = (ImageView) findViewById(R.id.imgTwoCell);
        p3 = (ImageView) findViewById(R.id.imgFourCell);
        p4 = (ImageView) findViewById(R.id.imgMorula);
        p5 = (ImageView) findViewById(R.id.imgBlastula);

        lrFerEgg = (LinearLayout) findViewById(R.id.lnFerEgg);
        lrTwoCell = (LinearLayout) findViewById(R.id.lnTwoCell);
        lrFourCell = (LinearLayout) findViewById(R.id.lnFourcell);
        lrMorula = (LinearLayout) findViewById(R.id.lnMorula);
        lrBlastula = (LinearLayout) findViewById(R.id.lnBlastula);

        slide = AnimationUtils.loadAnimation(this, R.anim.slide);
        slide2 = AnimationUtils.loadAnimation(this, R.anim.slide2);
        pulse = AnimationUtils.loadAnimation(this, R.anim.pulse);

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processthree.this, processfour.class);
                startActivity(i);
            }
        });

        btnPrev1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processthree.this, processtwo.class);
                startActivity(i);
            }
        });


        btnHome1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnHome1.setBackgroundResource(R.drawable.ivfthreehome_pressed);
                return false;
            }
        });
        btnHome1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHome1.setBackgroundResource(R.drawable.ivfthreehome_pressed);
                Intent i = new Intent(processthree.this, MainActivity.class);
                startActivity(i);
            }
        });
        btnNext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processthree.this, processfour.class);
                startActivity(i);
            }
        });

        btnPrev2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(processthree.this, processtwo.class);
                startActivity(i);
            }
        });



        lrFerEgg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p1.startAnimation(pulse);
                p2.clearAnimation();
                p3.clearAnimation();
                p4.clearAnimation();
                p5.clearAnimation();

            }
        });

        lrTwoCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p2.startAnimation(pulse);
                p1.clearAnimation();
                p3.clearAnimation();
                p4.clearAnimation();
                p5.clearAnimation();
            }
        });

        lrFourCell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p3.startAnimation(pulse);
                p1.clearAnimation();
                p2.clearAnimation();
                p4.clearAnimation();
                p5.clearAnimation();
            }
        });

        lrMorula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p4.startAnimation(pulse);
                p3.clearAnimation();
                p2.clearAnimation();
                p1.clearAnimation();
                p5.clearAnimation();
            }
        });

        lrBlastula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p5.startAnimation(pulse);
                p4.clearAnimation();
                p3.clearAnimation();
                p2.clearAnimation();
                p1.clearAnimation();
            }
        });
        imgText.startAnimation(slide);
        imgMiri.startAnimation(slide2);
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(processthree.this);
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
