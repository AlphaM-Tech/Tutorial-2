package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView
                txtview2 = findViewById(R.id.TvMsg2);
                txtview2.setText(R.string.Msg2);


                Log.i("Lifecycle", "OnCreate() invoked");

    }

    public void onStart() {
        super.onStart();

        Log.i("Lifecycle","OnStart() invoked");
    }
    public void onRestart() {
        super.onRestart();

        Log.i("Lifecycle","OnRestart() invoked");
    }
    public void onResume() {
        super.onResume();

        Log.i("Lifecycle","OnResume() invoked");
    }
    public void onPause() {
        super.onPause();

        Log.i("Lifecycle","onPause() invoked");
    }
    public void onStop() {
        super.onStop();

        Log.i("Lifecycle","onStop() invoked");
    }
    public void onDestroy() {
        super.onDestroy();

        Log.i("Lifecycle","onDestroy() invoked");
    }
}