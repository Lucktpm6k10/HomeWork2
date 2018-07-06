package com.example.vanluc.homework2_rikkeisoft.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.vanluc.homework2_rikkeisoft.R;

public class MainActivity extends AppCompatActivity {
    EditText et_Name;
    Button btn_Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay dư liệu từ editText Name
                String name = String.valueOf(et_Name.getText());
                //Truyen dữ liệu và start activity mới
                Intent intent = new Intent(MainActivity.this,StudentActivity.class);
                intent.putExtra("Name",name);
                startActivity(intent);
            }
        });
    }

    private void Anhxa() {
        et_Name = findViewById(R.id.etName);
        btn_Submit = findViewById(R.id.btnSubmit);
    }
}
