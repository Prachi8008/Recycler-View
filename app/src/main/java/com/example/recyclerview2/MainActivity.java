package com.example.recyclerview2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // link xml  to java
        setContentView(R.layout.activity_main);

        rcyView = findViewById(R.id.main);

        // Data class ka contractor
        ArrayList<Data> list = new ArrayList<>() ;

        list.add(new Data("Name",R.drawable.baseline_drive_file_rename_outline_24,R.drawable.baseline_delete_24));
        list.add(new Data("Phone",R.drawable.baseline_phone_24, R.drawable.baseline_delete_24));
        list.add(new Data("Airplane Mode Active",R.drawable.baseline_airplanemode_active_24, R.drawable.baseline_delete_24));
        list.add(new Data("Airplane Mode InActive",R.drawable.baseline_airplanemode_inactive_24, R.drawable.baseline_delete_24));
        list.add(new Data("Alarm On",R.drawable.baseline_alarm_on_24, R.drawable.baseline_delete_24));
        list.add(new Data("Alarm Off",R.drawable.baseline_alarm_off_24, R.drawable.baseline_delete_24));
        list.add(new Data("Name",R.drawable.baseline_drive_file_rename_outline_24, R.drawable.baseline_delete_24));
        list.add(new Data("Phone",R.drawable.baseline_phone_24, R.drawable.baseline_delete_24));
        list.add(new Data("Airplane Mode Active",R.drawable.baseline_airplanemode_active_24, R.drawable.baseline_delete_24));
        list.add(new Data("Airplane Mode InActive",R.drawable.baseline_airplanemode_inactive_24, R.drawable.baseline_delete_24));
        list.add(new Data("Alarm On",R.drawable.baseline_alarm_on_24, R.drawable.baseline_delete_24));
        list.add(new Data("Alarm Off",R.drawable.baseline_alarm_off_24, R.drawable.baseline_delete_24));
        list.add(new Data("Name",R.drawable.baseline_drive_file_rename_outline_24, R.drawable.baseline_delete_24));
        list.add(new Data("Phone",R.drawable.baseline_phone_24, R.drawable.baseline_delete_24));
        list.add(new Data("Airplane Mode Active",R.drawable.baseline_airplanemode_active_24, R.drawable.baseline_delete_24));
        list.add(new Data("Airplane Mode InActive",R.drawable.baseline_airplanemode_inactive_24, R.drawable.baseline_delete_24));
        list.add(new Data("Alarm On",R.drawable.baseline_alarm_on_24, R.drawable.baseline_delete_24));
        list.add(new Data("Alarm Off",R.drawable.baseline_alarm_off_24, R.drawable.baseline_delete_24));

        // Adapter class ka object
        Adapter adapter = new Adapter(list);

        LinearLayoutManager managerList = new LinearLayoutManager(MainActivity.this);
        rcyView.setLayoutManager(managerList);
        rcyView.setAdapter(adapter);

    }
}