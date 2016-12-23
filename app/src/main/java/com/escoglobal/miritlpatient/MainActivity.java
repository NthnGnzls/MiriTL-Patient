package com.escoglobal.miritlpatient;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.escoglobal.miritlpatient.ivfprocess.processone;

public class MainActivity extends AppCompatActivity {
    Button btnViewSite;
    MediaPlayer mp;
    Typeface helveticaLight,helveticaNeue;

    ImageButton btnIvfProcess1,btnEmbryoIncubation,btnChooseTimeLapse, btnVid, btnEmbryoClassification1;
    TextView miritlpatient,btnEmbryoClassification2,btnIvfProcess2,btnEmbryoIncubation2,btnChooseTimeLapse2,btnVid2,btnHome,btnEmbryoIncubation3,btnEmbryoClassification3,btnChooseTimeLapse3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(getApplicationContext(), R.raw.clicked);
        miritlpatient = (TextView) findViewById(R.id.txtMiriTLPATIENT);
        btnHome = (TextView) findViewById(R.id.txtHome);
        btnViewSite = (Button) findViewById(R.id.btnVisitWeb);
        btnIvfProcess1 = (ImageButton) findViewById(R.id.btnIVFProcess1);
        btnIvfProcess2 = (TextView) findViewById(R.id.btnIVFProcess2);
        btnEmbryoIncubation = (ImageButton) findViewById(R.id.btnEmbryoIncubation);
        btnEmbryoIncubation2 = (TextView) findViewById(R.id.btnEmbryoIncubation2);
        btnEmbryoIncubation3 = (TextView) findViewById(R.id.btnEmbryoIncubation3);
        btnEmbryoClassification1 = (ImageButton) findViewById(R.id.btnEmbryoClassification1);
        btnEmbryoClassification2 = (TextView) findViewById(R.id.btnEmbryoClassification2);
        btnEmbryoClassification3 = (TextView) findViewById(R.id.btnEmbryoClassification3);
        btnChooseTimeLapse = (ImageButton) findViewById(R.id.btnTimeLapse);
        btnChooseTimeLapse2 = (TextView) findViewById(R.id.btnTimeLapse2);
        btnChooseTimeLapse3 = (TextView) findViewById(R.id.btnTimeLapse3);
        btnVid = (ImageButton) findViewById(R.id.btnVid);
        btnVid2 = (TextView) findViewById(R.id.btnVid2);

        helveticaLight = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/HelveticaNeueLight.ttf");
        helveticaNeue = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/HelveticaNeueLight.ttf");

        btnIvfProcess2.setTypeface(helveticaLight);
        btnEmbryoIncubation2.setTypeface(helveticaLight);
        btnEmbryoIncubation3.setTypeface(helveticaLight);
        btnEmbryoClassification2.setTypeface(helveticaLight);
        btnEmbryoClassification3.setTypeface(helveticaLight);
        btnChooseTimeLapse2.setTypeface(helveticaLight);
        btnChooseTimeLapse3.setTypeface(helveticaLight);
        btnVid2.setTypeface(helveticaLight);
        btnHome.setTypeface(helveticaLight);
        btnViewSite.setTypeface(helveticaLight);
        miritlpatient.setTypeface(helveticaNeue);
        btnIvfProcess1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnIvfProcess2.setTextColor(Color.parseColor("#78e5e4"));
                btnIvfProcess1.setBackgroundResource(R.mipmap.ic_mfprocess_pressed);
                mp.start();
                return false;
            }
        });

        btnIvfProcess1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnIvfProcess2.setTextColor(Color.parseColor("#78e5e4"));
                btnIvfProcess1.setBackgroundResource(R.mipmap.ic_mfprocess_pressed);
                Intent i = new Intent(MainActivity.this, processone.class);
                mp.start();
                startActivity(i);
            }
        });
        btnIvfProcess2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnIvfProcess2.setTextColor(Color.parseColor("#78e5e4"));
                btnIvfProcess1.setBackgroundResource(R.mipmap.ic_mfprocess_pressed);
                mp.start();
                return false;
            }
        });
        btnIvfProcess2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnIvfProcess2.setTextColor(Color.parseColor("#78e5e4"));
                btnIvfProcess1.setBackgroundResource(R.mipmap.ic_mfprocess_pressed);
                Intent i = new Intent(MainActivity.this, processone.class);
                mp.start();
                startActivity(i);
            }
        });



        btnEmbryoIncubation.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnEmbryoIncubation2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation.setBackgroundResource(R.mipmap.ic_ei_pressed);
                mp.start();
                return false;
            }
        });
        btnEmbryoIncubation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEmbryoIncubation2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation.setBackgroundResource(R.mipmap.ic_ei_pressed);
                Intent i = new Intent(MainActivity.this, EmbryoIncubationActivity.class);
                mp.start();
                startActivity(i);
            }
        });
        btnEmbryoIncubation2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnEmbryoIncubation2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation.setBackgroundResource(R.mipmap.ic_ei_pressed);
                mp.start();
                return false;
            }
        });
        btnEmbryoIncubation2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEmbryoIncubation2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation.setBackgroundResource(R.mipmap.ic_ei_pressed);
                Intent i = new Intent(MainActivity.this, EmbryoIncubationActivity.class);
                mp.start();
                startActivity(i);
            }
        });
        btnEmbryoIncubation3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnEmbryoIncubation2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation.setBackgroundResource(R.mipmap.ic_ei_pressed);
                Intent i = new Intent (MainActivity.this, processone.class);
                mp.start();
                startActivity(i);
                return false;
            }
        });
        btnEmbryoIncubation3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnEmbryoIncubation3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoIncubation.setBackgroundResource(R.mipmap.ic_ei_pressed);
                mp.start();
                return false;
            }
        });





        btnEmbryoClassification1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnEmbryoClassification3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification1.setBackgroundResource(R.mipmap.ic_ec_pressed);
                mp.start();
                return false;
            }
        });
        btnEmbryoClassification1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEmbryoClassification3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification1.setBackgroundResource(R.mipmap.ic_ec_pressed);
                Intent i = new Intent(MainActivity.this, EmbryoClassificationActivity.class);
                mp.start();
                startActivity(i);
            }
        });
        btnEmbryoClassification2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnEmbryoClassification3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification1.setBackgroundResource(R.mipmap.ic_ec_pressed);
                mp.start();
                return false;
            }
        });
        btnEmbryoClassification2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEmbryoClassification3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification1.setBackgroundResource(R.mipmap.ic_ec_pressed);
                Intent i = new Intent(MainActivity.this, EmbryoClassificationActivity.class);
                mp.start();
                startActivity(i);
            }
        });
        btnEmbryoClassification3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnEmbryoClassification3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification1.setBackgroundResource(R.mipmap.ic_ec_pressed);
                mp.start();
                return false;
            }
        });
        btnEmbryoClassification3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnEmbryoClassification3.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification2.setTextColor(Color.parseColor("#78e5e4"));
                btnEmbryoClassification1.setBackgroundResource(R.mipmap.ic_ec_pressed);
                Intent i = new Intent(MainActivity.this, EmbryoClassificationActivity.class);
                mp.start();
                startActivity(i);
            }
        });



        btnChooseTimeLapse.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnChooseTimeLapse3.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse2.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_clock_pressed);
                mp.start();
                return false;
            }
        });
        btnChooseTimeLapse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnChooseTimeLapse3.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse2.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_clock_pressed);
                LayoutInflater li = LayoutInflater.from(MainActivity.this);
                final LinearLayout newNoteBaseLayout = (LinearLayout) li.inflate(R.layout.timelapse_layout, null);
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);

                VideoView vid = (VideoView) newNoteBaseLayout.findViewById(R.id.timelapseVideo);
                String vidname = "timelapsevid2";
                String packagename = "com.escoglobal.miritlpatient";
                Uri vidUri = Uri.parse("android.resource://"+packagename+"/raw/"+vidname);
                vid.setVideoURI(vidUri);
                vid.setZOrderOnTop(true);
                vid.start();
                builder1.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btnChooseTimeLapse3.setTextColor(Color.parseColor("#ffffff"));
                        btnChooseTimeLapse2.setTextColor(Color.parseColor("#ffffff"));
                        btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_timelapse);
                    }
                }).setTitle("TIME - LAPSE");
                builder1.setIcon(R.mipmap.ic_timelapseicon);
                builder1.setView(newNoteBaseLayout);
                mp.start();
                builder1.show();
            }
        });


        btnChooseTimeLapse2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnChooseTimeLapse3.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse2.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_clock_pressed);
                mp.start();
                return false;
            }
        });
        btnChooseTimeLapse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnChooseTimeLapse3.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse2.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_clock_pressed);
                LayoutInflater li = LayoutInflater.from(MainActivity.this);
                final LinearLayout newNoteBaseLayout = (LinearLayout) li.inflate(R.layout.timelapse_layout, null);
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);

                VideoView vid = (VideoView) newNoteBaseLayout.findViewById(R.id.timelapseVideo);
                String vidname = "timelapsevid2";
                String packagename = "com.escoglobal.miritlpatient";
                Uri vidUri = Uri.parse("android.resource://"+packagename+"/raw/"+vidname);
                vid.setVideoURI(vidUri);
                vid.setZOrderOnTop(true);
                vid.start();
                builder1.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btnChooseTimeLapse2.setTextColor(Color.parseColor("#ffffff"));
                        btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_timelapse);
                    }
                }).setTitle("TIME - LAPSE");
                builder1.setIcon(R.mipmap.ic_timelapseicon);
                builder1.setView(newNoteBaseLayout);
                mp.start();
                builder1.show();
            }
        });
        btnChooseTimeLapse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnChooseTimeLapse3.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse2.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_clock_pressed);
                mp.start();
                LayoutInflater li = LayoutInflater.from(MainActivity.this);
                final LinearLayout newNoteBaseLayout = (LinearLayout) li.inflate(R.layout.timelapse_layout, null);
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);

                VideoView vid = (VideoView) newNoteBaseLayout.findViewById(R.id.timelapseVideo);
                String vidname = "timelapsevid2";
                String packagename = "com.escoglobal.miritlpatient";
                Uri vidUri = Uri.parse("android.resource://"+packagename+"/raw/"+vidname);
                vid.setVideoURI(vidUri);
                vid.setZOrderOnTop(true);
                vid.start();
                builder1.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btnChooseTimeLapse3.setTextColor(Color.parseColor("#ffffff"));
                        btnChooseTimeLapse2.setTextColor(Color.parseColor("#ffffff"));
                        btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_timelapse);
                    }
                }).setTitle("TIME - LAPSE");
                builder1.setIcon(R.mipmap.ic_timelapseicon);
                builder1.setView(newNoteBaseLayout);
                builder1.show();
            }
        });
        btnChooseTimeLapse3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnChooseTimeLapse3.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse2.setTextColor(Color.parseColor("#78e5e4"));
                btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_clock_pressed);
                mp.start();
                LayoutInflater li = LayoutInflater.from(MainActivity.this);
                final LinearLayout newNoteBaseLayout = (LinearLayout) li.inflate(R.layout.timelapse_layout, null);
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);

                VideoView vid = (VideoView) newNoteBaseLayout.findViewById(R.id.timelapseVideo);
                String vidname = "timelapsevid2";
                String packagename = "com.escoglobal.miritlpatient";
                Uri vidUri = Uri.parse("android.resource://"+packagename+"/raw/"+vidname);
                vid.setVideoURI(vidUri);
                vid.setZOrderOnTop(true);
                vid.start();
                builder1.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        btnChooseTimeLapse3.setTextColor(Color.parseColor("#ffffff"));
                        btnChooseTimeLapse2.setTextColor(Color.parseColor("#ffffff"));
                        btnChooseTimeLapse.setBackgroundResource(R.mipmap.ic_timelapse);
                    }
                }).setTitle("TIME - LAPSE");
                builder1.setIcon(R.mipmap.ic_timelapseicon);
                builder1.setView(newNoteBaseLayout);
                builder1.show();
                return false;
            }
        });




        btnVid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnVid2.setTextColor(Color.parseColor("#78e5e4"));
                btnVid.setBackgroundResource(R.mipmap.ic_play_pressed);
                mp.start();
                return false;
            }
        });
        btnVid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnVid2.setTextColor(Color.parseColor("#78e5e4"));
                btnVid.setBackgroundResource(R.mipmap.ic_play_pressed);
                mp.start();
                if (AppStatus.getInstance(MainActivity.this).isOnline()) {
                    Toast.makeText(MainActivity.this,"Success!",Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, VideosActivity.class);
                    startActivity(i);
                }else{
                    btnVid2.setTextColor(Color.parseColor("#ffffff"));
                    btnVid.setBackgroundResource(R.mipmap.ic_vid);
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Please Check your Internet Connection")
                            .setNegativeButton("Retry", null)
                            .create()
                            .show();
                }
            }
        });

        btnVid2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                btnVid2.setTextColor(Color.parseColor("#78e5e4"));
                btnVid.setBackgroundResource(R.mipmap.ic_ei_pressed);
                mp.start();
                return false;
            }
        });
        btnVid2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnVid2.setTextColor(Color.parseColor("#78e5e4"));
                btnVid.setBackgroundResource(R.mipmap.ic_ei_pressed);
                mp.start();
                if (AppStatus.getInstance(MainActivity.this).isOnline()) {
                    Toast.makeText(MainActivity.this,"Loading Videos..",Toast.LENGTH_LONG).show();

                }else{
                    btnVid2.setTextColor(Color.parseColor("#ffffff"));
                    btnVid.setBackgroundResource(R.mipmap.ic_vid);
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Please Check your Internet Connection")
                            .setNegativeButton("Retry", null)
                            .create()
                            .show();
                }
            }
        });

        btnViewSite.setOnClickListener(new View.OnClickListener() {
            @SuppressWarnings("deprecation")
            @Override
            public void onClick(View view) {
                android.support.v7.app.AlertDialog.Builder alert = new android.support.v7.app.AlertDialog.Builder(MainActivity.this);
                WebView wv = new WebView(MainActivity.this);
                mp.start();
                WebSettings wbs = wv.getSettings();
                if (AppStatus.getInstance(MainActivity.this).isOnline()) {
                    wbs.setEnableSmoothTransition(true);
                    wv.getSettings().setJavaScriptEnabled(true);
                    wv.setWebViewClient(new Browser());
                    wv.loadUrl("http://medical.escoglobal.com/");
                    alert.setView(wv);
                } else {
                    wv.loadUrl( "javascript:window.location.reload( true )" );
                    wv.getSettings().setJavaScriptEnabled(true);
                    wv.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
                    wv.getSettings().setAppCacheEnabled(true);
                    wbs.setDomStorageEnabled(true);
                    wbs.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                    wbs.setEnableSmoothTransition(true);
                    wv.setWebViewClient(new Browser());
                    wv.loadUrl("http://medical.escoglobal.com/");
                    alert.setView(wv);
                }
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(MainActivity.this);
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
