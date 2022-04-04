package com.example.prac5;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.newb:
                Toast.makeText(this, "New Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Share:
                Toast.makeText(this, "Share Selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(this, "delete selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this, "save selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.search:
                Toast.makeText(this, "Search selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.exit:
                Toast.makeText(this, "Exit selected", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, "default", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }

}