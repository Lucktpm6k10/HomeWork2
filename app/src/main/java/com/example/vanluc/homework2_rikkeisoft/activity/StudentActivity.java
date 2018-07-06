package com.example.vanluc.homework2_rikkeisoft.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vanluc.homework2_rikkeisoft.R;
import com.example.vanluc.homework2_rikkeisoft.model.Student;

public class StudentActivity extends AppCompatActivity {
    EditText et_Address,et_Birtday,et_Sex,et_Class,et_Course;
    TextView tv_Name;
    Button btn_SendInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        AnhXa();
        //Lay name duoc truyen tu MainActivity va gán vào tv_name
        Intent Getintent = getIntent();
        String name = Getintent.getStringExtra("Name");
        tv_Name.setText(name);

        btn_SendInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //tao object moi
                Student student = new Student(tv_Name.getText().toString(),et_Address.getText().toString(),
                                              et_Birtday.getText().toString(),et_Sex.getText().toString(),
                                               et_Course.getText().toString(),et_Class.getText().toString() );
                Toast.makeText(StudentActivity.this, ""+student, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(StudentActivity.this,StudentInforActivity.class);
                Bundle bundle = new Bundle();
                //Truyen Object vao bundle
                bundle.putParcelable("Student",student);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    private void AnhXa() {
        et_Address = findViewById(R.id.etAddress);
        et_Birtday = findViewById(R.id.etBirthDay);
        et_Sex = findViewById(R.id.etSex);
        et_Course = findViewById(R.id.etCourse);
        et_Class = findViewById(R.id.etClass);
        btn_SendInfo = findViewById(R.id.btnSendInfo);
        tv_Name = findViewById(R.id.tvName);
    }
}
