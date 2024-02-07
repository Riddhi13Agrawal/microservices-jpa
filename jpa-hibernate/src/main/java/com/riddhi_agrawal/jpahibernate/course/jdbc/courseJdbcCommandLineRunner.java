/*package com.riddhi_agrawal.jpahibernate.course.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.riddhi_agrawal.jpahibernate.course.Course;

@Component
public class courseJdbcCommandLineRunner implements CommandLineRunner
{
    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String ... args) throws Exception
    {
        Course c = new Course(1, "AGGTM", "Holly Jackson");

        repository.insert(c); //makes sure that CourseJdbcRepository's insert function is getting executed.
        repository.insert(new Course(2, "Truly Devious", "Maureen Johnson"));
        repository.insert(new Course(3, "One of us is Lying", "Karen McManus"));
        repository.deleteById(1);
        System.out.println(repository.findById(2));
    }

}
*/
