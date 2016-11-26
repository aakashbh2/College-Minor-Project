package example.com.abhishek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button waterplant,admin,support,analysis,barcode,piechart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        waterplant = (Button) findViewById(R.id.waterplant);
        admin = (Button) findViewById(R.id.admin);
        support = (Button) findViewById(R.id.support);
        analysis = (Button) findViewById(R.id.analysis);
        barcode = (Button) findViewById(R.id.barchart);
        piechart = (Button) findViewById(R.id.piechartactivity);

        waterplant.setOnClickListener(this);
        admin.setOnClickListener(this);
        support.setOnClickListener(this);
        analysis.setOnClickListener(this);
        barcode.setOnClickListener(this);
        piechart.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.waterplant:
                startActivity(new Intent(MainActivity.this,WaterPlant.class));
                overridePendingTransition(R.anim.silde_in,R.anim.silde_out);
                break;
            case R.id.admin:
                startActivity(new Intent(MainActivity.this,Admin.class));
                overridePendingTransition(R.anim.silde_in,R.anim.silde_out);
                break;
            case R.id.analysis:
                startActivity(new Intent(MainActivity.this,Analysis.class));
                overridePendingTransition(R.anim.silde_in,R.anim.silde_out);
                break;
            case R.id.support:
                startActivity(new Intent(MainActivity.this,Support.class));
                overridePendingTransition(R.anim.silde_in,R.anim.silde_out);
                break;
            case R.id.barchart:
                startActivity(new Intent(MainActivity.this,Barchart.class));
                overridePendingTransition(R.anim.silde_in,R.anim.silde_out);
                break;
            case R.id.piechartactivity:
                startActivity(new Intent(MainActivity.this,PieChartActivity.class));
                overridePendingTransition(R.anim.silde_in,R.anim.silde_out);
                break;

        }
    }
}
