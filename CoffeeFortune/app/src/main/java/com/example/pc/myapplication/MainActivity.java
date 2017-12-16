package com.example.pc.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends ActionBarActivity implements View.OnTouchListener {

    Button fal_baktir, ust, dene;
    ToggleButton togg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fal_baktir = (Button) findViewById(R.id.image_falBaktir);
        ust = (Button) findViewById(R.id.ustCubuk);
        dene = (Button) findViewById(R.id.image_button2);

        Toast.makeText(MainActivity.this, "Hosgeldiniz !!! ",
                Toast.LENGTH_LONG).show();








/*togg= (ToggleButton) findViewById(R.id.toggle);

        togg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                togg.setText("bast");
                togg.setTextColor(Color.parseColor("#FF0033"));
               // togg.setBackgroundResource(R.drawable.leo);

            }
        });*/
        fal_baktir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, FalBaktir.class);
                startActivity(intent);


            }
        });

    }


    public void ChangeFragment(View view) {

        Fragment fragment;
        if (view == findViewById(R.id.image_button1)) {


            fragment = new Fragment_one();

            FragmentManager fm = getSupportFragmentManager();

            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place_profil, fragment);
            ust.setText(" ");
            ft.commit();

        }
        if (view == findViewById(R.id.image_button2)) {
            fragment = new Fallarim();


            ust.setTextColor(getResources().getColor(R.color.switch_thumb_material_light));
            FragmentManager fm = getSupportFragmentManager();

            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place_profil, fragment);
            ust.setText("Fallarim");
            ft.commit();
        }
        if (view == findViewById(R.id.user_button)) {
            fragment = new ProfilActivityFragment();

            ust.setTextColor(getResources().getColor(R.color.switch_thumb_material_light));
            FragmentManager fm = getSupportFragmentManager();

            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place_profil, fragment);
            ust.setText("Profil");
            ft.commit();
        }
        if (view == findViewById(R.id.image_burclar)) {
            fragment = new BurclarFragment();

            ust.setTextColor(getResources().getColor(R.color.switch_thumb_material_light));
            FragmentManager fm = getSupportFragmentManager();

            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place_profil, fragment);
            ust.setText("Burçlar");
            ft.commit();
        }

        if (view == findViewById(R.id.image_paketler)) {
            fragment = new PaketlerFragment();

            ust.setTextColor(getResources().getColor(R.color.switch_thumb_material_light));
            FragmentManager fm = getSupportFragmentManager();

            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_place_profil, fragment);
            ust.setText("Paketler");
            ft.commit();
        }


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

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }
}
