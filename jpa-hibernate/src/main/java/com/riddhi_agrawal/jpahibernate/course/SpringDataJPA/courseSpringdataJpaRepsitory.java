package com.riddhi_agrawal.jpahibernate.course.SpringDataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riddhi_agrawal.jpahibernate.course.Course;

public interface courseSpringdataJpaRepsitory extends JpaRepository<Course,Long>
{

   List<Course> findByAuthor(String author);
   List<Course> findByName(String name); 
} 
