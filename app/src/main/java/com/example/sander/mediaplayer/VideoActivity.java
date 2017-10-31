package com.example.sander.mediaplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        //get the videoview from the resources
        VideoView vView = (VideoView)findViewById(R.id.videoView1);
        //use this to get touch events
        vView.requestFocus();
        //have to load video from the resource folder
        //set the video path + add raw resource
        String vSource = "android.resource://com.example.helennagel.mediaplayer/" + R.raw.mm;
        //set the video URI, passing the vSource as a URI
        vView.setVideoURI(Uri.parse(vSource));
        //enable this if you want to enable video controllers such as pause and forward
        vView.setMediaController(new MediaController(this));
        //play the movie
        vView.start();
    }

    public void playMusic(View view) {
        Intent intent = new Intent(VideoActivity.this, MusicActivity.class);
        startActivity(intent);
    }
}
