package com.example.android.weatherapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;


public class MainActivity extends AppCompatActivity { //begin main

    // COMPLETED (1) Create a field to store the today display TextView
    private TextView nowTextView;
private TextView todayTextView;
    private TextView tomorrowTextView;
    private TextView thursdayTextView;

    private TextView patchogueTextView; //textview to hold api

    //assign values
    String now = "45*";
    String today = "56*/40*";
    String tomorrow = "70*/40*";
    String thursday = "45*/42*";

String patchogue;

    //USING A WEATHER API

    //calling/getting the url
    public BufferedReader getURL() throws IOException {
        //declare api url as a string
        String url = "http://api.openweathermap.org/data/2.5/forecast?q=Patchogue,us&cnt=7&appid=c3368eff18484472b806c8fbdf3df950";  //placing the url in a string
        BufferedReader input = new BufferedReader(new InputStreamReader(new URL(url).openStream(), "UTF-8"));
       // url=input.readLine();
        return input;

    }

    //String patchogue = IOUtils.toString(url);

   // public void parseURL(BufferedReader input)
    //{
     //
   // }


    //getting the string from the input stream...
    public static String getStringFromInputStream(InputStream stream) throws IOException
    {
        int n = 0;
        char[] buffer = new char[1024 * 4];
        InputStreamReader reader = new InputStreamReader(stream, "UTF8");
        StringWriter writer = new StringWriter();
        while (-1 != (n = reader.read(buffer))) writer.write(buffer, 0, n);
        return writer.toString();
    }


//setting stream to patchogue variable
    public void setStringFromInputStream(String writer)
    {
       patchogue=writer.toString();
       // patchogueTextView.append(patchogue);
    }


    public String getPatchogue(){
        return patchogue;
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) { //begin onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //adding an underline to the heading
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
patchogueTextView=(TextView)(findViewById(R.id.patchogue_text));







//append the strings to the textviews

        nowTextView.append(now);
        todayTextView.append(today);
        tomorrowTextView.append(tomorrow);
        thursdayTextView.append(thursday);
patchogueTextView.append(patchogue);













} //end onCreate










    } //end main
















