package com.example.user.akshit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    View v;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void onButtonClick (View v)
        {
           if(v.getId()== R.id.button2) {
                finish();
                System.exit(0);
            }
            else if (v.getId()==R.id.button)
            {
                EditText a=(EditText)findViewById(R.id.username);
                String str=a.getText().toString();
                Intent i=new Intent(MainActivity.this, Display.class);
                i.putExtra("Username",str);
                startActivity(i);
            }
    }
}