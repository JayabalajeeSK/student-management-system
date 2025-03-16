package com.jb.student_management_system.service;
import java.util.List;
import com.jb.student_management_system.dto.StudentDto;
//import jakarta.validation.Valid;
public interface StudentService 
{
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);
}
