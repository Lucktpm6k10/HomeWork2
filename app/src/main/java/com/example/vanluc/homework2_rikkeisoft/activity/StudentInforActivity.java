package com.example.vanluc.homework2_rikkeisoft.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vanluc.homework2_rikkeisoft.R;
import com.example.vanluc.homework2_rikkeisoft.model.Student;

public class StudentInforActivity extends AppCompatActivity {
    TextView tv_Name;
    TextView tv_Address;
    TextView tv_BirthDay;
    TextView tv_Sex;
    TextView tv_Course;
    TextView tv_Class;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_infor);
        Anhxa();
        //Lay object tu bundle
        Bundle b = getIntent().getExtras();
        Student student = b.getParcelable("Student");
        tv_Name.setText(student.getName());
        tv_BirthDay.setText(student.getBirthday());
        tv_Address.setText(student.getAddress());
        tv_Sex.setText(student.getSex());
        tv_Course.setText(student.getCourse());
        tv_Class.setText(student.getClas());
    }

    private void Anhxa() {
        tv_Name = findViewById(R.id.tvName);
        tv_Address = findViewById(R.id.tvAddress);
        tv_BirthDay = findViewById(R.id.tvBirthDay);
        tv_Sex = findViewById(R.id.tvSex);
        tv_Course = findViewById(R.id.tvCourse);
        tv_Class = findViewById(R.id.tvClass);
    }
}
