package com.toghether.toghether;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class add_badhabit extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s1;


    LinearLayout l;
    EditText et1;
    EditText et2;
    EditText et3;
    TextView ev4;


    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1=(Spinner)findViewById(R.id.spinner);


        l=(LinearLayout)findViewById(R.id.L1);
        et1=(EditText) findViewById(R.id.EditText1);
        et2=(EditText) findViewById(R.id.EditText2);
        et3=(EditText) findViewById(R.id.EditText3);
        ev4= (TextView) findViewById(R.id.textView5);
        l.setVisibility(LinearLayout.GONE);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.ithem_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        s1.setAdapter(adapter);
        s1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l1) {
        if (!s1.getSelectedItem().toString().equals("Choisis la mauvaise habitude"))
        {
            l.setVisibility((LinearLayout.VISIBLE));

        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void confirmer_click(View view) {
        if (( et1.getText().toString().equals("") ) || ( et2.getText().toString().equals("") )  || ( et3.getText().toString().equals("") ) ){

            ev4.setText("Veuillez remplire tous les champs");
        }else{

            if (!s1.getSelectedItem().toString().equals("Choisis la mauvaise habitude")) {
                BadHabit bh = new BadHabit(s1.getSelectedItem().toString(), Float.parseFloat(et1.getText().toString()), Float.parseFloat(et2.getText().toString()), Integer.parseInt(et3.getText().toString()));
            }else{

                ev4.setText("Entrer une mauvaise habitude");
            }
        }


    }


    public void annuler_click(View view) {

    }

    public void EditText1_click(View view) {
        et1.setText("");

    }
    public void EditText2_click(View view) {
        et2.setText("");

    }
    public void EditText3_click(View view) {
        et3.setText("");

    }
}
