package com.example.sortowanie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText email = findViewById(R.id.email);
        EditText h1 = findViewById(R.id.h1);
        EditText h2 = findViewById(R.id.h2);
        TextView witaj = findViewById(R.id.witaj);
        Button zat = findViewById(R.id.zat);

        zat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String a = email.getText().toString();
                if (a.contains("@")){
                    String a1 = h1.getText().toString();
                    String a2 = h2.getText().toString();
                    if (a1.equals(a2)){
                        witaj.setText("Witaj " + email.getText() + "autor jakub  pesele 03213312321");

                    }else {
                        witaj.setText("Hasla zle ");
                    }
                } else {
                    witaj.setText("Zly email");
                }

            }
        });


    }
}