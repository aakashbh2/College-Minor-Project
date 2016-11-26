package example.com.abhishek;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import br.com.goncalves.pugnotification.notification.PugNotification;
import example.com.abhishek.PhpScriptCalling.CheckConnection;
import example.com.abhishek.PhpScriptCalling.JsonTaskMarvel;
import uk.co.barbuzz.beerprogressview.BeerProgressView;

public class WaterPlant extends AppCompatActivity {

    private BeerProgressView mBeerProgressView;
    private AsyncTask<Boolean, Integer, Boolean> mPourBeerTask;
    ListView textView;
    TextView water;
    CheckConnection cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_plant);
        textView = (ListView) findViewById(R.id.textview);
        water= (TextView) findViewById(R.id.water);
        mBeerProgressView = (BeerProgressView) findViewById(R.id.beerProgressView);


        cd = new CheckConnection(getApplicationContext());
        if (cd.isConnectingToInternet()) {
            pourBeer(ContextCompat.getColor(this, R.color.lager),
                    ContextCompat.getColor(this, R.color.lager_bubble));
        }
        else  Toast.makeText(WaterPlant.this,"Check Your Network Connection",Toast.LENGTH_SHORT).show();
    }

    private void pourBeer(int beerColour, int bubbleColour) {
        if (mPourBeerTask != null) {
            mPourBeerTask.cancel(true);
            mPourBeerTask = null;
            mBeerProgressView.setBeerProgress(0);
        }
        mBeerProgressView.setBeerColor(beerColour);
        mBeerProgressView.setBubbleColor(bubbleColour);
        mPourBeerTask = new Task(this, mBeerProgressView).execute(true);
        Notify();
    }

    private void Notify() {
        //new JsonTaskMarvel(getApplicationContext(), textView).execute("http://aakashbhatnagar.comule.com/test.php");
        new JsonTaskMarvel(getApplicationContext(), textView).execute("http://minor.womenite.com/callhardware.php");
        PugNotification.with(getBaseContext())
                .load()
                .title("Started to Water Plants")
                .message("Watering of plants has begun!!!")
                .smallIcon(R.drawable.img)
                .largeIcon(R.drawable.img)
                .flags(Notification.DEFAULT_ALL)
                .simple()
                .build();
    }
}


