package com.example.phamm.customlistviewandcustomadapter_demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<FlagFootball> arrayList;
    AdapterFlag adapterFlag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        adapterFlag = new AdapterFlag(this,R.layout.custom_layout_flag,arrayList);
        listView.setAdapter(adapterFlag);
    }

    private void AnhXa(){
        listView = (ListView) findViewById(R.id.ListViewFlag);

        arrayList = new ArrayList<>();

        arrayList.add(new FlagFootball("Arsenal","1886-2017",R.drawable.image_1));
        arrayList.add(new FlagFootball("MU","1878-2017",R.drawable.flagmu));
        arrayList.add(new FlagFootball("Chealsea","1905-2017",R.drawable.flagcs));
        arrayList.add(new FlagFootball("MC","1880-2017",R.drawable.flagmc));
        arrayList.add(new FlagFootball("LiverPool","1892-2017",R.drawable.flaglvp));
        arrayList.add(new FlagFootball("RealMarid","1902-2017",R.drawable.flagreal));
    }

}
