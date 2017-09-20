package com.una.takeurpills;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TutorialStep2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_step2);
        TextView saltar = (TextView) findViewById(R.id.tvStepsSaltar);
        saltar.setPaintFlags(saltar.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        saltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intento);
            }
        });
        Button nextStep = (Button) findViewById(R.id.btNextStep);
        nextStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(getApplicationContext(), TutorialStep3Activity.class);
                startActivity(intento);
            }
        });
    }
}
