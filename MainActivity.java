package com.xcheko51x.zxingfragment;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button btnFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment = findViewById(R.id.btnFragment);

        btnFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new BlankFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.contenedor, fragment);
                transaction.commit();
            }
        });
    }


}
