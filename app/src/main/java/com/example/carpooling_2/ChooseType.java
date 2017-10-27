package com.example.carpooling_2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class ChooseType extends AppCompatActivity {

    private Button b2;

    private RadioGroup radioGroup;



    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.driver:
                if (checked)
                    changePage();
                    break;
            case R.id.passenger:
                if (checked)
                    changePage();
                    break;
        }
    }


    public void changePage(){
        b2=(Button) findViewById(R.id.next);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent ato=new Intent(ChooseType.this,RouteDeclaration.class);

                startActivity(ato);
            }

        });



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_type);

        changePage();
    }
}
