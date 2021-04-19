package com.shreeram.adminapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.shreeram.adminapp.Model.MaintainceModel;
import com.shreeram.adminapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    FirebaseDatabase database;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getData();
            }
        });
    }

    private void getData() {
        String SocietyName = binding.etSocityName.getText().toString();
        String Mantaines = binding.etMantaines.getText().toString();
        String Meter = binding.etmetervalue.getText().toString();
        MaintainceModel maintainceModel = new MaintainceModel(SocietyName, Mantaines, Meter);
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("Admin");
        reference.push().setValue(maintainceModel);
    }
}