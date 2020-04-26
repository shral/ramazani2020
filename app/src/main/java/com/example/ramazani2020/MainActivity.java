package com.example.ramazani2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    private static final int HIXHRI = 0;
    private static final int IMSAKU = 1;
    private static final int LINDJA_E_DIELLIT = 2;
    private static final int DREKA = 3;
    private static final int IKINDIA = 4;
    private static final int AKSHAMI = 5;
    private static final int JACIJA = 6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        //date
        final int DATE = calendar.get(Calendar.DAY_OF_MONTH);
        final int MONTH = calendar.get(Calendar.MONTH) + 1;
        TextView dita = findViewById(R.id.dita_id);
        TextView date = findViewById(R.id.date_id);
        TextView imsaku = findViewById(R.id.imsaku_id);
        TextView iftari = findViewById(R.id.iftari_id);
        Resources res = getResources();
        Class<R.array> resClass = R.array.class;
        try {
           int id = resClass.getField("day_" + DATE + "_" + MONTH).getInt(null);
            String[] data = res.getStringArray(id);
            System.out.println(id);
            System.out.println(data[HIXHRI]);
            System.out.println(data[IMSAKU]);
            System.out.println(data[LINDJA_E_DIELLIT]);
            System.out.println(data[DREKA]);
            System.out.println(data[IKINDIA]);
            System.out.println(data[JACIJA]);
            System.out.println(data[AKSHAMI]);
            System.out.println(DATE);
            dita.setText(data[HIXHRI].split("_")[1]);
            date.setText(DATE + "." + MONTH);
            imsaku.setText(data[IMSAKU]);
            iftari.setText(data[AKSHAMI]);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
