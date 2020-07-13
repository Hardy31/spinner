package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selected(View view){
        BeerExpert expert = new BeerExpert();

        TextView text = (TextView) findViewById(R.id.propozition);
        Button btn = (Button) findViewById(R.id.button1);
        Spinner spn = (Spinner) findViewById(R.id.spiner);
        String beerType = String.valueOf(spn.getSelectedItem());

//        text.setText(beerType);

        List<String> beetList  = expert.getBeers(beerType);
        StringBuilder beerFormatted = new StringBuilder();
        for (String brend:beetList){
            beerFormatted.append(brend).append('\n');
        }
        text.setText(beerFormatted);
    }
}