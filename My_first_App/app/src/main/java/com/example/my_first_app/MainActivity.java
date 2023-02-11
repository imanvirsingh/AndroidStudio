package com.example.my_first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button ShowText;
    private TextView nameText;
    private EditText enterName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShowText= findViewById(R.id.button);
        nameText=findViewById(R.id.textView);
        enterName=findViewById(R.id.editTextName);


        ShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name= enterName.getText().toString();
                if(name.isEmpty()){
                    nameText.setText("Please Enter Name");
                }else {
                    nameText.setText("Hello " + name);
                }

            }
        });
        //nameText.setText("hello from java");
    }
}