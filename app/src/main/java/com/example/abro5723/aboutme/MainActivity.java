package com.example.abro5723.aboutme;
/**
 * author- Ashton Brown
 * Version- 1.2
 * A simple app that deals with the alteration of visibility.
 */

//Necessary imports required for the applications arguments to process correctly
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;


public class MainActivity extends AppCompatActivity
{

    //Created variables to use in code
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
    private RelativeLayout background;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //association of created variables with existing stuff in Layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (RelativeLayout) findViewById(R.id.Background);
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
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Method for changing the background of the program
    private void changeBackgroundColor()
    {
        int redColor;
        int blueColor;
        int greenColor;

        redColor = (int) (Math.random()*256);
        greenColor = (int) (Math.random()*256);
        blueColor = (int) (Math.random()*256);

        background.setBackgroundColor(Color.rgb(redColor, blueColor, greenColor));
    }

    //Method for changing the visibility of all of the variables
    //Designed for the changing of every variable
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

    //Again, the program changes visibility of all variables so that certain things are visible
    //and others are not
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

    //Just as before. The alteration of visibility
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

    //Helper method for the changing of sleep widgets
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

    //final helper method for eating widgets
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

    //Listeners get setup so that the buttons do stuff
    private void setupListeners()
    {
        //method for the eating buttons function
        eatingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeEatingVisibility();
                changeBackgroundColor();
            }
        });

        //method for the sleeping objects
        sleepingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeSleepVisibility();
                changeBackgroundColor();
            }
        });

        //method for gaming objects
        gamingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeGameVisibility();
                changeBackgroundColor();
            }
        });

        //method for programming objects
        programmingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeProgramVisibility();
                changeBackgroundColor();
            }
        });

        //method for all accent objects
        accentButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                changeAccentVisibility();
                changeBackgroundColor();
            }

        });

    }
}
