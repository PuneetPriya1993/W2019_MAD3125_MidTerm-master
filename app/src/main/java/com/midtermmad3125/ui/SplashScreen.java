package com.midtermmad3125.ui;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.midtermmad3125.R;

public class SplashScreen extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

         getSupportActionBar().hide();

    Thread myThread = new Thread();

    myThread.run();
   //public void run
        {
            try {
                SystemClock.sleep(9000);
            }

            catch (Exception e)
            {
                System.out.print(e);
            }

            finally {
                Intent intent = new Intent(this,MainCityActivity.class);
                startActivity(intent);

            }
        }

       //



    }
}
