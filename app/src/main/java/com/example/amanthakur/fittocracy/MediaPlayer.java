package com.example.amanthakur.fittocracy;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.net.URI;

public class MediaPlayer extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Bundle b = getIntent().getExtras();
        String id = String.valueOf(b.getInt("address"));
        String name = b.getString("name");

        getSupportActionBar().setTitle(name);
        //Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + (String)(b.getCharSequence("address")));

        final VideoView videoView =(VideoView)findViewById(R.id.videoView);

        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        //specify the location of media file
         Uri uri=Uri.parse("android.resource://" + getPackageName() + "/"
                + id );

        //Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController);
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        this.finish();
        return true;
    }

}
