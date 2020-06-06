package sample.example.entities;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Subject {
  
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  
  @ManyToMany(mappedBy = "subjects")
  private Set<Student> students;
  
    public Subject(){
    }
    
    public Subject(String name){
      this.name = name;
    }
    
    public Subject(String name, Set<Student> students){
      this.name = name;
      this.students = students;
    }
  
  // name
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  // students
  public Set<Student> getStudents() {
    return students;
  }
  
  public void setStudents(Set<Student> students) {
    this.students = students;
  }
  
  @Override
  public String toString(){
  return "hello Subject";
  }
}