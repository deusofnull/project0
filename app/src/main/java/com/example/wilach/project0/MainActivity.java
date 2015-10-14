package com.example.wilach.project0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button movie_button;
    private Button scores_button;
    private Button library_button;
    private Button xyz_button;
    private Button build_it_button;
    private Button capstone_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie_button = (Button) findViewById(R.id.movie_app_button);
        movie_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Log.d("movie_app", "movie app button clicked.");
                Toast.makeText(getApplicationContext(), "this will launch the movie app!", Toast.LENGTH_SHORT).show();
            }
        });

        scores_button = (Button) findViewById(R.id.scores_app_button);
        scores_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Log.d("scores_app", "Scores app button clicked");
                Toast.makeText(getApplicationContext(), "this will launch the scores app", Toast.LENGTH_SHORT).show();
            }
        });

        library_button = (Button) findViewById(R.id.library_app_button);
        library_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Log.d("library_app", "Library app button clicked");
                Toast.makeText(getApplicationContext(), "this will launch the library app", Toast.LENGTH_SHORT).show();
            }
        });

        build_it_button = (Button) findViewById(R.id.build_app_button);
        build_it_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Log.d("build_app", "Build it Bigger app button clicked");
                Toast.makeText(getApplicationContext(), "this will launch the Build it Bigger app", Toast.LENGTH_SHORT).show();
            }
        });

        xyz_button = (Button) findViewById(R.id.xyz_app_button);
        xyz_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Log.d("XYZ_app", "XYZ  app button clicked");
                Toast.makeText(getApplicationContext(), "this will launch the XYZ app", Toast.LENGTH_SHORT).show();
            }
        });

        capstone_button = (Button) findViewById(R.id.capstone_app_button);
        capstone_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Log.d("capstone_app", "Capstone app button clicked");
                Toast.makeText(getApplicationContext(), "this will launch the Capstone app", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
