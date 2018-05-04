package com.example.mussabaheen.vengineers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void go_to_main_activity(View view) {
        ed1=(EditText)findViewById(R.id.username);
        ed2=(EditText)findViewById(R.id.password);
        username=ed1.getText().toString();
        password=ed2.getText().toString();
        if(username.equals("svengineers") && password.equals("123456") ){
            Intent i1 = new Intent(Main2Activity.this, MainActivity.class);
            i1.putExtra("run", true);
            startActivity(i1);
            finish();
        }
        else
        {
            Toast.makeText(this, "Username:svengineers  Password :123456", Toast.LENGTH_LONG).show();
        }
    }

    public void sign_up_prototype(View view) {
        Toast.makeText(this, "Username:svengineers  Password :123456", Toast.LENGTH_LONG).show();
    }
}
