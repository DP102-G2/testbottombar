package com.example.testbottombar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class RunningActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);

        bottomNavigationView = findViewById(R.id.runningnavigation);
        NavController navController = Navigation.findNavController(this, R.id.nav_running_fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.running:
//                Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.running2Fragment);

                return true;
            case R.id.store:
//                Navigation.findNavController(this, R.id.nav_host_fragment).navigate(R.id.storeFragment);
                Intent intent = new Intent();
                intent.setClass(RunningActivity.this,MainActivity.class);
                startActivity(intent);
                RunningActivity.this.finish();
                return true;
            case R.id.setting:



                break;

            default:
                return super.onOptionsItemSelected(item);

        }
        return true;
    }
}
