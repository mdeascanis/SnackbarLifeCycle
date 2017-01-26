//Matthew DeAscanis
//

package edu.dtcc.cis282student.snackbarlifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Snackbar.make(toolbar, "onCreate", Snackbar.LENGTH_LONG)
                       .setAction("Action", null).show();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
         //       Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
         //               .setAction("Action", null).show();




                //Snackbar snackbar = Snackbar.make(toolbar, "Welcome to AndroidHive", Snackbar.LENGTH_LONG);

               // snackbar.show();



            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Matt", "onStart");
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();

        Snackbar.make(findViewById(R.id.toolbar), "onStart", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v("Matt", "onREsume");
        Toast.makeText(getApplicationContext(), "onREsume", Toast.LENGTH_SHORT).show();

        Snackbar.make(findViewById(R.id.toolbar), "onREsume", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v("Matt", "onREstart");
        Toast.makeText(getApplicationContext(), "onREstart", Toast.LENGTH_SHORT).show();

        Snackbar.make(findViewById(R.id.toolbar), "onREstart", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("Matt", "onPause");
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();

        Snackbar.make(findViewById(R.id.toolbar), "onPause", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("Matt", "onStop");
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();

        Snackbar.make(findViewById(R.id.toolbar), "onStop", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("Matt", "onDestroy");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();

        Snackbar.make(findViewById(R.id.toolbar), "onDestroy", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


}
