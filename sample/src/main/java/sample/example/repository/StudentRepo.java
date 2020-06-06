package sample.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sample.example.entities.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
