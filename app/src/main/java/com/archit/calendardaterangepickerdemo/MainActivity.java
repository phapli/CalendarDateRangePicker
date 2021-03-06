package com.archit.calendardaterangepickerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.archit.calendardaterangepicker.customviews.DateRangeCalendarView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    private DateRangeCalendarView calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar = (DateRangeCalendarView) findViewById(R.id.calendar);
/*
        Typeface typeface = Typeface.createFromAsset(getAssets(), "JosefinSans-Regular.ttf");
//        Typeface typeface = Typeface.createFromAsset(getAssets(), "LobsterTwo-Regular.ttf");
        calendar.setFonts(typeface);*/
        calendar.setCalendarListener(new DateRangeCalendarView.CalendarListener() {
            @Override
            public void onFirstDateSelected(Calendar startDate) {
                Toast.makeText(MainActivity.this, "Start Date: " + startDate.getTime().toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDateRangeSelected(Calendar startDate, Calendar endDate) {
                Toast.makeText(MainActivity.this, "Start Date: " + startDate.getTime().toString() + " End date: " + endDate.getTime().toString(), Toast.LENGTH_SHORT).show();
            }

        });

    }


}
