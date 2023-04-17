package com.example.anew;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private ImageButton imgb;
    private RadioButton rb;
    private CheckBox chb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //my commands

        imgb=findViewById(R.id.imageButton4);
        textView = findViewById(R.id.text_view);
        button = findViewById(R.id.button);
        chb= findViewById(R.id.checkBox);
        button.setOnClickListener(v -> textView.setText("Easter"));
        imgb.setOnClickListener(v -> button.setText("hihi"));
        chb.setOnClickListener(v -> button.setText("yasa"));
        RadioButton rb = findViewById(R.id.radioButton);
        rb= findViewById(R.id.radioButton);
        rb.setOnClickListener(v -> {
            Snackbar snackbar = Snackbar.make(v, "Hello everyone!", Snackbar.LENGTH_LONG);
            snackbar.show();
            Toast.makeText(getApplicationContext(), "Hello one by one!", Toast.LENGTH_LONG).show();

        });


    }
}

