package com.example.appangu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio=MediaPlayer.create(this,R.raw.audio);
        audio.start();

        //crear un delay de tiempo para lanzar la app

        TimerTask inicioApp=new TimerTask() {
            @Override
            public void run() {

                //lanzar la nueva actividad

                Intent nuevaActividad =new Intent(MainActivity.this,Home.class);
                startActivity(nuevaActividad);

            }
        };

        Timer tiempo=new Timer();
        tiempo.schedule(inicioApp,6000);


    }
}

