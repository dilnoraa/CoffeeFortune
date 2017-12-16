package com.example.pc.myapplication;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;


public class ProfilActivityFragment extends Fragment implements View.OnClickListener {


    Button dogumTarihiB;
    Spinner iliski_durum;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_profil_activity,
                container, false);

        dogumTarihiB = (Button) view.findViewById(R.id.dogumtarihiProfil);
        iliski_durum= (Spinner) view.findViewById(R.id.spinneriliski_durum);




        iliski_durum.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {



            }
        });



        dogumTarihiB.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.dogumtarihiProfil:
                Calendar mcurrentTime = Calendar.getInstance();
                int year = mcurrentTime.get(Calendar.YEAR);
                int month = mcurrentTime.get(Calendar.MONTH);
                int day = mcurrentTime.get(Calendar.DAY_OF_MONTH);
                Toast.makeText(getActivity(), "zaman",
                        Toast.LENGTH_LONG).show();
                DatePickerDialog datePicker;
                datePicker = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear,
                                          int dayOfMonth) {

                        dogumTarihiB.setText(dayOfMonth + "/" + monthOfYear + "/" + year);

                    }
                }, year, month, day);
                datePicker.setTitle("Tarih Seciniz");
                datePicker.setButton(DatePickerDialog.BUTTON_POSITIVE, "Ayarla", datePicker);
                datePicker.setButton(DatePickerDialog.BUTTON_NEGATIVE, "Iptal", datePicker);

                datePicker.show();
                break;
        }
    }
}
