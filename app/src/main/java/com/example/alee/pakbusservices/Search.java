package com.example.alee.pakbusservices;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class Search  extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchpage);


        Button butt = (Button) (findViewById(R.id.button));
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(Search.this, ServiceProfile.class);
                startActivity(i);
                finish();
            }//onClick ends here...
        });


    }//oncreate
}
