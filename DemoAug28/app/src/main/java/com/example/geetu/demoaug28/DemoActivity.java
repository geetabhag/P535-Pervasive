package com.example.geetu.demoaug28;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DemoActivity extends AppCompatActivity {
    private RadioGroup radioSubjectGroup;
    private RadioButton radioSubjectButton;
    private Button btnDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();
    }



    public void addListenerOnButton() {

        radioSubjectGroup = (RadioGroup) findViewById(R.id.radioSubject);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);

        btnDisplay.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioSubjectGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioSubjectButton = (RadioButton) findViewById(selectedId);

                Toast.makeText(DemoActivity.this,
                        radioSubjectButton.getText(), Toast.LENGTH_SHORT).show();

            }

        });

    }

}

