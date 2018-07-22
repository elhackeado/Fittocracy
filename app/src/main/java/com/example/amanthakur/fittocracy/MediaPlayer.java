package com.example.amanthakur.fittocracy;

import android.graphics.Color;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.net.URI;

public class MediaPlayer extends AppCompatActivity {
TextView textView,textView2,textView3,textView4,textView5;
Button addbtn,subtractbtn,startbtn;
EditText timerInputET ;
ImageButton imgbtn;
ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Bundle b = getIntent().getExtras();
        String id = String.valueOf(b.getInt("address"));
        String name = b.getString("name");

        getSupportActionBar().setTitle(name);

        textView = (TextView) findViewById(R.id.textView5);
        textView2 = (TextView) findViewById(R.id.textView6);
        textView3 = (TextView) findViewById(R.id.textView7);
        textView4 = (TextView) findViewById(R.id.textView8);
        textView4.setText(name);
        textView5 = (TextView) findViewById(R.id.textView9);

        timerInputET = (EditText) findViewById(R.id.timerInput);

        addbtn = (Button) findViewById(R.id.add);
        subtractbtn = (Button) findViewById(R.id.subtract);
        startbtn = (Button) findViewById(R.id.start);

        imgView = (ImageView) findViewById(R.id.imageView3);

        imgbtn = (ImageButton) findViewById(R.id.imageButton);

        //Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + (String)(b.getCharSequence("address")));

        final VideoView videoView =(VideoView)findViewById(R.id.videoView);

        //Creating MediaController
        //final MediaController mediaController= new MediaController(this);
        //mediaController.setAnchorView(videoView);

        //specify the location of media file
         final Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"
                + id );


         addbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int input = Integer.parseInt(timerInputET.getText().toString().trim());
                 if(input<600){
                     timerInputET.setText(""+(input+10));
                 }
                 else {
                     //Toast.makeText(MediaPlayer.this,"MAX TIME LIMIT EXCEEDED",Toast.LENGTH_LONG).show();
                     Snackbar snackbar = Snackbar.make(view,"UPPER TIME LIMIT IS 600 SECONDS.",Snackbar.LENGTH_LONG);
                     View sbView = snackbar.getView();
                     sbView.setBackgroundColor(Color.BLACK);
                     sbView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                     TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                     textView.setTextColor(Color.WHITE);
                     snackbar.show();
                     timerInputET.setText(""+600);
                 }
             }
         });

         subtractbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int input = Integer.parseInt(timerInputET.getText().toString().trim());

                 if(input>20){
                     timerInputET.setText("" + (input-10));
                 }
                 else {
                     //Toast.makeText(MediaPlayer.this,"LEAST LIMIT : 20 SECONDS ",Toast.LENGTH_LONG).show();
                     Snackbar snackbar = Snackbar.make(view,"LOWER TIME LIMIT IS 10 SECONDS.",Snackbar.LENGTH_LONG);
                     View sbView = snackbar.getView();
                     sbView.setBackgroundColor(Color.BLACK);
                     sbView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                     TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                     textView.setTextColor(Color.WHITE);
                     snackbar.show();
                     timerInputET.setText(""+20);
                 }
             }
         });

         startbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                    int input = Integer.parseInt(timerInputET.getText().toString());

                    if(input<=600 && input>=20) {
                        textView.setVisibility(View.GONE);
                        textView2.setVisibility(View.GONE);
                        textView3.setVisibility(View.GONE);
                        textView4.setVisibility(View.GONE);
                        timerInputET.setVisibility(View.GONE);
                        addbtn.setVisibility(View.GONE);
                        subtractbtn.setVisibility(View.GONE);
                        startbtn.setVisibility(View.GONE);

                        new CountDownTimer(input*1000, 1000) { // Here I want to have a user input value in milli seconds instead of pre loaded value of 30000

                            public void onTick(long millisUntilFinished) {
                                textView5.setText("" + millisUntilFinished / 1000);
                            }

                            public void onFinish() {
                                textView5.setText("TIME'S UP!!");
                                imgbtn.setVisibility(View.VISIBLE);
                                // Turning on the button when the timer has finnished
                                //mButton.setEnabled(true);
                                //mButton.setClickable(true);
                                videoView.stopPlayback();
                            }
                        }.start();

                        textView5.setVisibility(View.VISIBLE);
                        imgView.setVisibility(View.VISIBLE);
                        videoView.setVisibility(View.VISIBLE);

                        //videoView.setMediaController(mediaController);
                        videoView.setVideoURI(uri);
                        videoView.requestFocus();
                        videoView.start();
                        videoView.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(android.media.MediaPlayer mediaPlayer) {
                                videoView.start();
                            }
                        });
                    }
                    else{
                        //Toast.makeText(MediaPlayer.this,"Input 20-600 Seconds",Toast.LENGTH_LONG).show();
                        Snackbar snackbar = Snackbar.make(view,"TIME LIMIT : 20-600 SECONDS.",Snackbar.LENGTH_LONG);
                        View sbView = snackbar.getView();
                        sbView.setBackgroundColor(Color.BLACK);
                        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                        textView.setTextColor(Color.WHITE);
                        snackbar.show();
                        timerInputET.setText(""+20);
                    }
             }
         });
        //Setting MediaController and URI, then starting the videoView
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                textView2.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
                timerInputET.setVisibility(View.VISIBLE);
                addbtn.setVisibility(View.VISIBLE);
                subtractbtn.setVisibility(View.VISIBLE);
                startbtn.setVisibility(View.VISIBLE);
                imgView.setVisibility(View.VISIBLE);

                videoView.setVisibility(View.GONE);
                textView5.setVisibility(View.GONE);
                imgbtn.setVisibility(View.GONE);



            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        this.finish();
        return true;
    }

}
