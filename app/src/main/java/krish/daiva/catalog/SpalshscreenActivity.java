package krish.daiva.catalog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SpalshscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_screen);
        new AsyncDataLoader().execute();

    }


    private class AsyncDataLoader extends AsyncTask<String, Void, Void> {

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            startActivity(new Intent(SpalshscreenActivity.this,MainActivity.class));
            finish();
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }



        @Override
        protected Void doInBackground(String... params) {
            // TODO Auto-generated method stub

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){

            }
            return null;
        }


    }



}
