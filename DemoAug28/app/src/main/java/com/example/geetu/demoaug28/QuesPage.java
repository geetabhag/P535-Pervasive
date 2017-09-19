package com.example.geetu.demoaug28;

/**
 * Created by Geetu on 9/15/2017.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class QuesPage extends AppCompatActivity{

    Button answer1,answer2,answer3,answer4;
    TextView score,question;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques);
        answer1=(Button) findViewById(R.id.answer1);
        answer2=(Button) findViewById(R.id.answer2);
        answer3=(Button) findViewById(R.id.answer3);
        answer4=(Button) findViewById(R.id.answer4);

        score=(TextView) findViewById(R.id.score);
        question=(TextView) findViewById(R.id.question);

        answer1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
        answer2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
        answer3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
        answer4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }
}
