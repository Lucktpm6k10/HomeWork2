package com.example.vanluc.homework2_rikkeisoft.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Student implements Parcelable {
    private String name;
    private String birthday;
    private String sex;
    private String address;
    private String course;
    private String clas;

    public Student() {
    }

    protected Student(Parcel in) {
        name = in.readString();
        birthday = in.readString();
        sex = in.readString();
        address = in.readString();
        course = in.readString();
        clas = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public Student(String name, String birthday, String sex, String address, String course, String clas) {

        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
        this.course = course;
        this.clas = clas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(birthday);
        dest.writeString(sex);
        dest.writeString(address);
        dest.writeString(course);
        dest.writeString(clas);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", course='" + course + '\'' +
                ", clas='" + clas + '\'' +
                '}';
    }
}
