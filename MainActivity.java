package com.example.registration2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private EditText ea;
    private EditText eb;
    private EditText ec;
    private EditText ed;
    private TextView ta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                button1=findViewById(R.id.button1);
                ea=findViewById(R.id.ea);
                eb=findViewById(R.id.eb);
                ec=findViewById(R.id.ec);
                ed=findViewById(R.id.ed);
                ta=findViewById(R.id.ta);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "Student Registered Successfully", Toast.LENGTH_SHORT).show();
                    }
      });
            }
        }

    }

}