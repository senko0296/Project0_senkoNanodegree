package com.example.anirudhraghunath.project0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashBoardActivity extends AppCompatActivity implements View.OnClickListener {


    Button spotifyStreamerButton, scoresAppButton, libraryAppButton, buildItBiggerButton, baconReaderButton, capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        spotifyStreamerButton = (Button) findViewById(R.id.spotify_streamer_button);
        scoresAppButton = (Button) findViewById(R.id.scores_app_button);
        libraryAppButton = (Button) findViewById(R.id.library_app_button);
        buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        baconReaderButton = (Button) findViewById(R.id.bacon_reader_button);
        capstoneButton = (Button) findViewById(R.id.capstone_button);

        spotifyStreamerButton.setOnClickListener(this);
        scoresAppButton.setOnClickListener(this);
        libraryAppButton.setOnClickListener(this);
        buildItBiggerButton.setOnClickListener(this);
        baconReaderButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Button clickedButton = (Button) findViewById(view.getId());
        Toast.makeText(getApplicationContext(), "This will launch : " + clickedButton.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }
}
