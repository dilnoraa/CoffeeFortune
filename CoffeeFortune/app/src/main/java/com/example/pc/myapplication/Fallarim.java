package com.example.pc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import java.util.Calendar;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Fallarim extends Fragment implements View.OnClickListener {

    Button oku_button,ust_b,taslak_button, oku_button2,oku_button3;
    Calendar cl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fallarim,
                container, false);
        oku_button = (Button) view.findViewById(R.id.okuButton1);
        oku_button2 = (Button) view.findViewById(R.id.okuButton2);
        oku_button3 = (Button) view.findViewById(R.id.okuButton3);

        ust_b= (Button) view.findViewById(R.id.ustCubuk);
        taslak_button= (Button) view.findViewById(R.id.taslakButton);

        cl = Calendar.getInstance();
//date format is:  "Date-Month-Year Hour:Minutes am/pm"
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm a"); //Date and time
        String currentDate = sdf.format(cl.getTime());

//Day of Name in full form like,"Saturday", or if you need the first three characters you have to put "EEE" in the date format and your result will be "Sat".
        SimpleDateFormat sdf_ = new SimpleDateFormat("EEEE");
        Date date = new Date();
        String dayName = sdf_.format(date);

        taslak_button.setText(" TASLAK \n \n"+ "" + dayName + " " + currentDate + "");

        oku_button.setOnClickListener(this);
        oku_button2.setOnClickListener(this);
        oku_button3.setOnClickListener(this);
        // Inflate the layout for this fragment
        return view;
       // return inflater.inflate(R.layout.fragment_fallarim, container, false);


    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(), FalHazirActivity.class);
        switch (v.getId()) {
            case R.id.okuButton1:

                startActivity(intent);


                break;

            case R.id.okuButton2:


                startActivity(intent);


                break;

            case R.id.okuButton3:


                startActivity(intent);


                break;

        }
    }
}
