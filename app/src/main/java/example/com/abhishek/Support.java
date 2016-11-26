package example.com.abhishek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Support extends AppCompatActivity implements View.OnClickListener {

    Button useage,problems,about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support);

        useage = (Button) findViewById(R.id.useage);
        problems = (Button) findViewById(R.id.problems);
        about = (Button) findViewById(R.id.about);

        useage.setOnClickListener(this);
        problems.setOnClickListener(this);
        about.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.useage:
                startActivity(new Intent(Support.this,Useage.class));
                break;
            case R.id.about:
                startActivity(new Intent(Support.this,About.class));
                break;
            case R.id.problems:
                startActivity(new Intent(Support.this,Problem.class));
                break;

        }
    }
}
