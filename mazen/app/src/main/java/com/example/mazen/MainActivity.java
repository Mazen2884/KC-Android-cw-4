package com.example.mazen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText firstnum = findViewById(R.id.editTextTextPersonName2);
        EditText Secoundnum =findViewById(R.id.editTextTextPersonName);
        Button button= findViewById(R.id.button);
        TextView result = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = firstnum.getText().toString();
                String b = Secoundnum.getText().toString();

                int x = Integer.parseInt(a);
                int y = Integer.parseInt(b);

               int z = x + y;

               result.setText(z + "");
            }
        });




    }

}