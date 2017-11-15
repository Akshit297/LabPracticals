package com.example.user.akshit;

import android.app.Activity;
import android.os.Bundle;
public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    setContentView(R.layout.display);
    String username=getIntent().getStringExtra("Username");
}
}
