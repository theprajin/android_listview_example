package com.infotechnocation.listadapterexample.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.infotechnocation.listadapterexample.Employees;
import com.infotechnocation.listadapterexample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prajin Bajracharya on 11/25/2016.
 */

public class CustomAdapter extends ArrayAdapter<Employees> {
    private Context context;
    private ArrayList<Employees> employeesArrayList;
    private int resourceId;
    public CustomAdapter(Context context, int resource, ArrayList<Employees> list) {
        super(context, resource, list);
        this.context = context;
        this.employeesArrayList = list;
        this.resourceId = resource;
    }

    @Override
    public int getCount() {
        return employeesArrayList.size();
    }

    @Nullable
    @Override
    public Employees getItem(int position) {
        return employeesArrayList.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater mLayoutinflater = LayoutInflater.from(context);
        View view = mLayoutinflater.inflate(R.layout.employee_item,parent,false);

        TextView txtPos=(TextView)view.findViewById(R.id.txtPosition);
        TextView txtName= (TextView) view.findViewById(R.id.txtName);
        TextView txtAddress=(TextView)view.findViewById(R.id.txtAddress);
        Employees mEmployees=getItem(position);
        txtAddress.setText(mEmployees.getAddress());
        txtName.setText(mEmployees.getName());
        txtPos.setText(mEmployees.getPosition());

        return view;
    }
}
