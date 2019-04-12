package com.example.juancarlosmilena.jdaexemplevideoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView miVideoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miVideoView = findViewById(R.id.videoView);

        //Indico que fichero multimedia quiero cargar
        //formando el path con la sintaxis adecuada
        miVideoView.setVideoPath("android.resource://"+
        getPackageName()+"/"+R.raw.cancion1);

        //Inicializar MediaController
        mediaController = new MediaController(this);

        //Asignar MediaController al VideoView
        miVideoView.setMediaController(mediaController);

        //Fijar el MediaController a la vista del VideoView
        mediaController.setAnchorView(miVideoView);

        //Permito que el MediaController gestione el Player
        mediaController.setMediaPlayer(miVideoView);


    }
}
