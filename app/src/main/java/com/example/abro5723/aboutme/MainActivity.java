package com.example.abro5723.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

    private Button eatingButton;
    private Button sleepingButton;
    private Button gamingButton;
    private Button programmingButton;
    private Button accentButton;
    private ImageView accentsView;
    private ImageView gamingView;
    private ImageView sleepgView;
    private ImageView eatingView;
    private ImageView programmingView;
    private TextView eatingText;
    private TextView sleepingText;
    private TextView gamingText;
    private TextView prorammingText;
    private TextView accentsText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eatingButton = (Button) findViewById(R.id.eatingButton);
        sleepingButton = (Button) findViewById(R.id.sleepingButton);
        gamingButton = (Button) findViewById(R.id.gamingButton);
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
