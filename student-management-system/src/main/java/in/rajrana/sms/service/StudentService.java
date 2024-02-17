package in.rajrana.sms.service;

import java.util.List;

import in.rajrana.sms.dto.StudentDto;

public interface StudentService {
    List<StudentDto> getAllStudents();

    void createStudent(StudentDto student);

    StudentDto getStudentById(Long studentId);

    void updateStudent(StudentDto studentDto);

    void deleteStudent(Long studentId);
}
