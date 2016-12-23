package com.escoglobal.miritlpatient;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by nathaniel.gonzales on 14/12/2016.
 */

public class ConventionalIVFActivity extends Activity {

    TextView back1;
    ImageButton back2;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.embryoconventional_layout);


        back1 = (TextView) findViewById(R.id.btnCBack);
        back2 = (ImageButton) findViewById(R.id.btnECHome);

        back1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                back2.setBackgroundResource(R.drawable.conventionalhome_pressed);
                return false;
            }
        });
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back2.setBackgroundResource(R.drawable.conventionalhome_pressed);
                Intent i = new Intent(ConventionalIVFActivity.this, EmbryoIncubationActivity.class);
                startActivity(i);
            }
        });

        back2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                back2.setBackgroundResource(R.drawable.conventionalhome_pressed);
                Intent i = new Intent(ConventionalIVFActivity.this, EmbryoIncubationActivity.class);
                startActivity(i);
                return false;
            }
        });
        back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back2.setBackgroundResource(R.drawable.conventionalhome_pressed);
                Intent i = new Intent(ConventionalIVFActivity.this, EmbryoIncubationActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(ConventionalIVFActivity.this);
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
