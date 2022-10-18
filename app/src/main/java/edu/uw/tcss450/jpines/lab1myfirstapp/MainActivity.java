package edu.uw.tcss450.jpines.lab1myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("Lab 1", "onCreate()");
    }
    @Override
    protected void  onStart(){
        super.onStart();
        Log.e("Lab 1", "onStart()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Lab 1", "onResume()");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("Lab 1", "onPause()");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.w("Lab 1", "onRestart()");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.e("Lab 1", "onStop()");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.w("Lab 1", "onDestroy()");
    }
}
