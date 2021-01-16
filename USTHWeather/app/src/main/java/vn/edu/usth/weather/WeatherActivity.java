package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

    }

    @Override
    public void onStart() {

        super.onStart();
        Log.i("onStart" , "This is when started?" );
    }

    @Override
    public void onResume() {

        super.onResume();
        Log.i("onResume" , "This is when resumed?" );
    }

    @Override
    public void onPause() {

        super.onPause();
        Log.i("onPause" , "This is when paused?" );
    }
    @Override
    public void onStop() {

        super.onStop();
        Log.i("onStop" , "This is when stop?" );
    }
    @Override
    public void onDestroy() {

        super.onDestroy();
        Log.i("onDestroy" , "This is when destroy?" );
    }
}