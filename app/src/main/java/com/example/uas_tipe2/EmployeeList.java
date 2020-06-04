package com.example.uas_tipe2;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EmployeeList extends ArrayAdapter<Employee> {
    private Activity conext;
    private List<Employee> employeeList;

    public EmployeeList(Activity conext, List<Employee> employeeList){
        super(conext, R.layout.list_layout, employeeList);
        this.conext = conext;
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inlflater = conext.getLayoutInflater();

        View listViewItem = inlflater.inflate(R.layout.list_layout, null, true);

        TextView textViewNama = listViewItem.findViewById(R.id.namanya);
        TextView textViewJabatan = listViewItem.findViewById(R.id.jabatannya);

        Employee employee = employeeList.get(position);

        textViewNama.setText(employee.getNama());
        textViewJabatan.setText(employee.getPosisi());

        return listViewItem;
    }
}
