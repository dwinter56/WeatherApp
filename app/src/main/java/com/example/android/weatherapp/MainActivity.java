package com.example.android.weatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { //begin main

    // COMPLETED (1) Create a field to store the today display TextView
    private TextView nowTextView;
private TextView todayTextView;
    private TextView tomorrowTextView;
    private TextView thursdayTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) { //begin onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String heading="Weather App";
        TextView weatherAppText=(TextView)findViewById(R.id.weather_text);
        SpannableString spanString = new SpannableString(heading);
        spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
        weatherAppText.setText(spanString);



        //reference the xml textviews
    nowTextView=(TextView)(findViewById(R.id.now_text));
        todayTextView = (TextView) (findViewById(R.id.today_text));
     tomorrowTextView = (TextView) (findViewById(R.id.tomorrow_text));
     thursdayTextView = (TextView) (findViewById(R.id.thursday_text));


//assign values
        String now = "45*";
        String today = "56*/40*";
        String tomorrow = "70*/40*";
        String thursday = "45*/42*";


//append the strings to the textviews





   nowTextView.append(now);
   todayTextView.append(today);
        tomorrowTextView.append(tomorrow);
        thursdayTextView.append(thursday);



} //end onCreate

    } //end main
















