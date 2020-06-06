package sample.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sample.example.entities.Subject;



@Repository
public interface SubjectRepo extends JpaRepository<Subject, Integer>{

}
