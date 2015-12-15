package com.clogic.gokaraoke;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    ImageView iv_launcher;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "연결된 어플리케이션이 없습니다.", Toast.LENGTH_LONG).show();

        iv_launcher = (ImageView) findViewById(R.id.iv_launcher);
        iv_launcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index%2 == 0) {
                    iv_launcher.setImageResource(R.mipmap.gostation);
                } else {
                    iv_launcher.setImageResource(R.mipmap.gokaraoke);
                }
                index++;
            }
        });
    }
}
