package com.jb.student_management_system.service.impl;
import java.util.List;
import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jb.student_management_system.dto.StudentDto;
import com.jb.student_management_system.entity.Student;
import com.jb.student_management_system.mapper.StudentMapper;
import com.jb.student_management_system.repository.StudentRepository;
import com.jb.student_management_system.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    //@Autowired
    private StudentRepository studentRepository;
    //@Autowired //when only one constructor - dont need of autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        List<StudentDto> studentDtos =  students.stream()
                                                .map((student) -> StudentMapper  
                                                .mapToStudentDto(student))
                                                .collect(Collectors.toList());
    return studentDtos;
    }

    @Override
    public void createStudent(StudentDto studentDto) 
    {
        Student student = StudentMapper.mapToStudent(studentDto);
        studentRepository.save(student);

    }

    @Override
    public StudentDto getStudentById(Long studentId) 
    {
        Student student = studentRepository.findById(studentId).get();
        StudentDto studentDto = StudentMapper.mapToStudentDto(student);
        return studentDto;
    }

    @Override
    public void updateStudent(StudentDto studentDto) {
        studentRepository.save(StudentMapper.mapToStudent(studentDto));
        
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}