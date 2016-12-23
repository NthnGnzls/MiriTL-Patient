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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by nathaniel.gonzales on 11/24/2016.
 */

public class EmbryoIncubationActivity extends Activity {
    Button btnConvention, btnTimeLapse;
    ImageButton btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.embryoincubation_layout);

        btnConvention = (Button) findViewById(R.id.btnConventionalProcess);
        btnTimeLapse = (Button) findViewById(R.id.btnTimeLapseProcess);
        btnHome = (ImageButton) findViewById(R.id.btnptwohome1);


        btnHome.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                btnHome.setBackgroundResource(R.drawable.ivftwohome_pressed);
                return false;
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnHome.setBackgroundResource(R.drawable.ivftwohome_pressed);
                Intent i = new Intent(EmbryoIncubationActivity.this, MainActivity.class);
                startActivity(i);
            }
        });


        btnConvention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /** LayoutInflater li = LayoutInflater.from(EmbryoIncubationActivity.this);
                final LinearLayout newNoteBaseLayout = (LinearLayout) li.inflate(R.layout.embryoconventional_layout, null);
                AlertDialog.Builder builder = new AlertDialog.Builder(EmbryoIncubationActivity.this);

                builder.setNegativeButton("Back", null).setTitle("CONVENTIONAL IVF");
                builder.setIcon(R.mipmap.ic_microscope);
                builder.setView(newNoteBaseLayout);
                builder.show();
                //Toast.makeText(getActivity(),"Convention!",Toast.LENGTH_LONG).show(); **/

                Intent i = new Intent(EmbryoIncubationActivity.this, ConventionalIVFActivity.class);
                startActivity(i);
            }
        });

        btnTimeLapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmbryoIncubationActivity.this, EmbryoTimeLapseActivity.class);
                startActivity(i);

            }
        });
    }
    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(EmbryoIncubationActivity.this);
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
