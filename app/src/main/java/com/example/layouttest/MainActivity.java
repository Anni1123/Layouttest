package com.example.layouttest;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public void buttontapped(View view){
        Log.i("Button tapped",Integer.toString(view.getId()));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

    public void zoomv(View view) {
        startActivity(new Intent(MainActivity.this,ZoomScrollView.class));
    }
    public void shadow(View view) {
        startActivity(new Intent(MainActivity.this,LongShadow.class));
    }
    public void blur(View view) {
        startActivity(new Intent(MainActivity.this,BlurImage.class));
    }
    public void clock(View view) {
        startActivity(new Intent(MainActivity.this,CLockAnimation.class));
    }

    public void zigzag(View view) {
        startActivity(new Intent(MainActivity.this,ZigZagVu.class));
    }

    public void animate(View view) {
        startActivity(new Intent(MainActivity.this,AndroidView.class));
    }
}
