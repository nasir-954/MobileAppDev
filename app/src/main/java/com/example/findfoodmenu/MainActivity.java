package com.example.findfoodmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MealExpert expert = new MealExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Called when the user clicks the button
    public void onClickFindMenu (View view){
        //Added for launching Menuactivity
        Intent intent = new Intent(this, MenuActivity.class);



        TextView menus = (TextView) findViewById(R.id.menus);

        Spinner meals = (Spinner) findViewById(R.id.meals);
        String meal = String.valueOf(meals.getSelectedItem());
        //menus.setText("You have selected "+meal);
        List<String> menuList = expert.getMenus(meal);
        StringBuilder menuFormatted = new StringBuilder();
        for(String menu: menuList) {
            menuFormatted.append(menu).append('\n');
        }
        //menus.setText(menuFormatted);
        //Casting text view to String
        String menusText = menuFormatted.toString();

        intent.putExtra(MenuActivity.EXTRA_MESSAGE, menusText);
        startActivity(intent);
    }
}