package com.sda.school.model;

import javax.persistence.*;

@Table(name = "grade")
@Entity(name = "Grade")
public class Grade extends EntityBase{

    @Column(name = "value")
    private Integer value;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    public Grade(){
        //For ORM
    }

    public Grade(Integer value, Student student) {
        this.value = value;
        this.student = student;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
