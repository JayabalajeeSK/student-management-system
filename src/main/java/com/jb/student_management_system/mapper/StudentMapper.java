package com.jb.student_management_system.mapper;

import com.jb.student_management_system.dto.StudentDto;
import com.jb.student_management_system.entity.Student;

public class StudentMapper {
    public static StudentDto mapToStudentDto(Student student)
    {
        StudentDto studentDto = new StudentDto
        (
            student.getId(),
            student.getFirstName(),
            student.getLastName(),
            student.getEmail()
        );
        return studentDto;
    }

    public static Student mapToStudent(StudentDto studentDto)
    {
        Student student = new Student
        (
            studentDto.getId(),
            studentDto.getFirstName(),
            studentDto.getLastName(),
            studentDto.getEmail()
        );
        return student;
    }
}