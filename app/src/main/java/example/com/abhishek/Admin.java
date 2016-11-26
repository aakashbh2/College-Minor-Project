package example.com.abhishek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Admin extends AppCompatActivity implements View.OnClickListener {

    Button change,add,delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        change = (Button) findViewById(R.id.change);
        add = (Button) findViewById(R.id.add);
        delete = (Button) findViewById(R.id.delete);

        change.setOnClickListener(this);
        add.setOnClickListener(this);
        delete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.change:
               startActivity(new Intent(Admin.this,Login.class));
                break;
            case R.id.add:
                Toast.makeText(this,"Add User",Toast.LENGTH_SHORT).show();
                break;
            case R.id.delete:
                Toast.makeText(this,"Delete User",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
