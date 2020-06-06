package sample.example.entities;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import javax.persistence.*;


@Entity
public class Student {
 
 @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String name;
 
 @ManyToMany(cascade = CascadeType.ALL)
   @JoinTable(name = "student_subject", joinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"), 
   inverseJoinColumns = @JoinColumn(name = "subject_id", referencedColumnName = "id"))
 private Set<Subject> subjects;
 
 public Student(){
   
 }
 
 public Student(String name){
   this.name = name;
 }
 
 public Student(String name, Set<Subject> subjects){
   this.name = name;
   this.subjects = subjects;
 }
 
 // name
 public String getName() {
   return name;
 }
 public void setName(String name) {
   this.name = name;
 }
 
 // subjects
 public Set<Subject> getSubjects() {
   return subjects;
 }
 
 public void setSubjects(Set<Subject> subjects) {
   this.subjects = subjects;
 }
 
 @Override
 public String toString(){
  
   return "info";
 }
}