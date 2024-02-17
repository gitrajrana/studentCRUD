package in.rajrana.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rajrana.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
