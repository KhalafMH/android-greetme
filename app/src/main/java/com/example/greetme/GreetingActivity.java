package com.example.greetme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GreetingActivity extends AppCompatActivity {

//    private EditText nameField;
//    private Button greetMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        final EditText nameField = (EditText) findViewById(R.id.nameField);
        final Button greetMeButton = (Button) findViewById(R.id.greetButton);

        greetMeButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameField.getText().toString();

                Toast toast = Toast.makeText(GreetingActivity.this, "Hello " + name, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
