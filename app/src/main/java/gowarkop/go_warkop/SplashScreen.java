package gowarkop.go_warkop;


import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;


public class SplashScreen extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Menghilangkan action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This method will be executed once the timer
                //start your app main activity
                Intent i = new Intent (SplashScreen.this,Login.class);
                startActivity(i);

                //close this activity
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
