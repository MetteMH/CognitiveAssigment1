package group4.cognitiveassigment1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView txtContinue;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_main, container, false);
        txtContinue = (TextView) v.findViewById(R.id.start);

        txtContinue.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                launchMenu();
            }

        });

        return v;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainActivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*    @Override
    protected void onStop() {
        Log.w(ACTIVITY_SERVICE, "App stopped");

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.w(ACTIVITY_SERVICE, "App destroyed");

        super.onDestroy();
    }*/

    void launchMenu(){
        Intent i = new Intent(this, ColorExercise.class);
        startActivity(i);
    }
}
