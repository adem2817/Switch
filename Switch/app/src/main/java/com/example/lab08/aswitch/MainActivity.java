package com.example.lab08.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Switch varMi;
    TextView text1,text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        varMi = findViewById(R.id.switch1);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);



        varMi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(MainActivity.this, "Allah analı babalı büyütsün", Toast.LENGTH_SHORT).show();
                    text1.setText("birinci");

                    text2.setVisibility(View.INVISIBLE);
                    text1.setVisibility(View.VISIBLE);

                }else{
                    Toast.makeText(MainActivity.this, "hayırlısı be gülüm", Toast.LENGTH_SHORT).show();
                    text2.setText("ikinci");
                    text1.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.VISIBLE);

                }
            }
        });
    }
}
