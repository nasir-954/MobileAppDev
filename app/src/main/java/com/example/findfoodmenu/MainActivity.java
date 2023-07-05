package com.example.findfoodmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the user clicks the button
    public void onClickFindMenu (View view){
        TextView menu = (TextView) findViewById(R.id.menu);
        Spinner meals = (Spinner) findViewById(R.id.meals);
        String meal = String.valueOf(meals.getSelectedItem());
        menu.setText("You have selected "+meal);

    }
}