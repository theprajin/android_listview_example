package com.infotechnocation.listadapterexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.infotechnocation.listadapterexample.adapter.CustomAdapter;

import java.util.ArrayList;

/**
 * Created by Prajin Bajracharya on 11/25/2016.
 */

public class ListActivityExample extends AppCompatActivity {

    public ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listID);
        // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        CustomAdapter adapter=new CustomAdapter(this,R.layout.employee_item,getEmployeeLIst());
        listView.setAdapter(adapter);
    }

    public ArrayList<String> getEplList() {

        ArrayList<String> eplList = new ArrayList<String>();
        eplList.add("Arsenal");
        eplList.add("Everton");
        eplList.add("Chelsea");
        return eplList;
    }


    public ArrayList<Employees> getEmployeeLIst() {

        ArrayList<Employees> list = new ArrayList<>();
        list.add(new Employees("Krishna", "ktm", "Android dev"));
        list.add(new Employees("Ram", "Bhaktapur", "Python developer"));
        return list;
    }
}
