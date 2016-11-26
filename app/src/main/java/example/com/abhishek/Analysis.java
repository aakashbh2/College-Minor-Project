package example.com.abhishek;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

import example.com.abhishek.PhpScriptCalling.CheckConnection;

public class Analysis extends AppCompatActivity  implements SwipeRefreshLayout.OnRefreshListener{

    private SwipeRefreshLayout swipeRefreshLayout;
    CheckConnection cd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        cd = new CheckConnection(getApplicationContext());
        if (cd.isConnectingToInternet()) {
            swipeRefreshLayout.setOnRefreshListener(this);

            swipeRefreshLayout.post(new Runnable() {
                                        @Override
                                        public void run() {
                                            swipeRefreshLayout.setRefreshing(true);
                                            onRefresh();
                                        }
                                    }
            );
        }else  Toast.makeText(Analysis.this,"Check Your Network Connection",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRefresh() {

        swipeRefreshLayout.setRefreshing(false);
        Toast.makeText(Analysis.this,"Temperature Already Updated",Toast.LENGTH_SHORT).show();

    }
}
