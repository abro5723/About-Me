package com.example.abro5723.aboutme;

import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button eatingButton;
    private Button sleepingButton;
    private Button gamingButton;
    private Button programmingButton;
    private Button accentButton;
    private ImageView accentsView;
    private ImageView gamingView;
    private ImageView sleepingView;
    private ImageView eatingView;
    private ImageView programmingView;
    private TextView eatingText;
    private TextView sleepingText;
    private TextView gamingText;
    private TextView programmingText;
    private TextView accentsText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eatingButton = (Button) findViewById(R.id.eatingButton);
        sleepingButton = (Button) findViewById(R.id.sleepingButton);
        gamingButton = (Button) findViewById(R.id.gamingButton);
        programmingButton = (Button) findViewById(R.id.programmingButton);
        accentButton = (Button) findViewById(R.id.accentButton);
        accentsView = (ImageView) findViewById(R.id.accentsView);
        gamingView = (ImageView) findViewById(R.id.gamingView);
        sleepingView = (ImageView) findViewById(R.id.sleepView);
        eatingView = (ImageView) findViewById(R.id.eatingView);
        programmingView = (ImageView) findViewById(R.id.programmingView);
        eatingText = (TextView) findViewById(R.id.eatingText);
        sleepingText = (TextView) findViewById(R.id.sleepingText);
        gamingText = (TextView) findViewById(R.id.gamingText);
        programmingText = (TextView) findViewById(R.id.programmingText);
        accentsText = (TextView) findViewById(R.id.accentText);

        setupListeners();

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

    private void changeAccentVisibility()
    {
        if(accentsText.getVisibility() == View.GONE && accentsView.getVisibility() == View.GONE)
        {
            accentsText.setVisibility(View.VISIBLE);
            accentsView.setVisibility(View.VISIBLE);
            programmingText.setVisibility(View.GONE);
            programmingView.setVisibility(View.GONE);
            eatingView.setVisibility(View.GONE);
            eatingText.setVisibility(View.GONE);
            sleepingView.setVisibility(View.GONE);
            sleepingText.setVisibility(View.GONE);
            gamingView.setVisibility(View.GONE);
            gamingText.setVisibility(View.GONE);
        }
        else
        {
            accentsText.setVisibility(View.GONE);
            accentsView.setVisibility(View.GONE);
        }
    }

    private void changeProgramVisibility()
    {
        if(programmingText.getVisibility() == View.GONE && programmingView.getVisibility() == View.GONE)
        {
            programmingText.setVisibility(View.VISIBLE);
            programmingView.setVisibility(View.VISIBLE);
            eatingView.setVisibility(View.GONE);
            eatingText.setVisibility(View.GONE);
            sleepingView.setVisibility(View.GONE);
            sleepingText.setVisibility(View.GONE);
            gamingView.setVisibility(View.GONE);
            gamingText.setVisibility(View.GONE);
            accentsText.setVisibility(View.GONE);
            accentsView.setVisibility(View.GONE);
        }
        else
        {
            programmingText.setVisibility(View.GONE);
            programmingView.setVisibility(View.GONE);
        }
    }

    private void changeGameVisibility()
    {
        if(gamingText.getVisibility() == View.GONE && gamingView.getVisibility() == View.GONE)
        {
            gamingView.setVisibility(View.VISIBLE);
            gamingText.setVisibility(View.VISIBLE);
            eatingView.setVisibility(View.GONE);
            eatingText.setVisibility(View.GONE);
            sleepingView.setVisibility(View.GONE);
            sleepingText.setVisibility(View.GONE);
            accentsText.setVisibility(View.GONE);
            accentsView.setVisibility(View.GONE);
            programmingText.setVisibility(View.GONE);
            programmingView.setVisibility(View.GONE);

        }
        else
        {
            gamingView.setVisibility(View.GONE);
            gamingText.setVisibility(View.GONE);
        }
    }

    private void changeSleepVisibility()
    {
        if(sleepingText.getVisibility() == View.GONE && sleepingView.getVisibility() == View.GONE)
        {
            sleepingView.setVisibility(View.VISIBLE);
            sleepingText.setVisibility(View.VISIBLE);
            eatingView.setVisibility(View.GONE);
            eatingText.setVisibility(View.GONE);
            programmingText.setVisibility(View.GONE);
            programmingView.setVisibility(View.GONE);
            gamingText.setVisibility(View.GONE);
            gamingView.setVisibility(View.GONE);
            accentsText.setVisibility(View.GONE);
            accentsView.setVisibility(View.GONE);
        }
        else
        {
            sleepingText.setVisibility(View.GONE);
            sleepingView.setVisibility(View.GONE);
        }
    }

    private void changeEatingVisibility()
    {
        if(eatingText.getVisibility() == View.GONE && eatingView.getVisibility() == View.GONE)
        {
            eatingText.setVisibility(View.VISIBLE);
            eatingView.setVisibility(View.VISIBLE);
            programmingText.setVisibility(View.GONE);
            programmingView.setVisibility(View.GONE);
            gamingText.setVisibility(View.GONE);
            gamingView.setVisibility(View.GONE);
            accentsText.setVisibility(View.GONE);
            accentsView.setVisibility(View.GONE);
            sleepingView.setVisibility(View.GONE);
            sleepingText.setVisibility(View.GONE);
        }
        else
        {
            eatingText.setVisibility(View.GONE);
            eatingView.setVisibility(View.GONE);
        }
    }

    private void setupListeners()
    {
        eatingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeEatingVisibility();
            }
        });

        sleepingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeSleepVisibility();
            }
        });

        gamingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeGameVisibility();
            }
        });

        programmingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeProgramVisibility();
            }
        });

        accentButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeAccentVisibility();
            }

        });

    }
}
