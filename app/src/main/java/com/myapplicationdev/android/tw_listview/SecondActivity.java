package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayList<Module> year1, year2, year3;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        year1 = new ArrayList<Module>();
        year1.add(new Module("C208", R.drawable.prog));
        year1.add(new Module("C200", R.drawable.nonprog));
        year1.add(new Module("C346", R.drawable.prog));

        year2 = new ArrayList<Module>();
        year2.add(new Module("C207", R.drawable.prog));
        year2.add(new Module("C273", R.drawable.prog));
        year2.add(new Module("B216", R.drawable.nonprog));

        year3 = new ArrayList<Module>();
        year3.add(new Module("C349", R.drawable.prog));
        year3.add(new Module("C302", R.drawable.prog));
        year3.add(new Module("C347", R.drawable.prog));

        if(year.equalsIgnoreCase("Year 1")) {
            aa = new ModuleAdapter(this, R.layout.row, year1);
        }else if(year.equalsIgnoreCase("Year 2")){
            aa = new ModuleAdapter(this, R.layout.row, year2);
        }else{
            aa = new ModuleAdapter(this, R.layout.row, year3);
        }
        lv.setAdapter(aa);
    }



}
