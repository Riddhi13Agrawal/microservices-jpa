package com.riddhi_agrawal.jpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.riddhi_agrawal.jpahibernate.course.SpringDataJPA.courseSpringdataJpaRepsitory;
//import com.riddhi_agrawal.jpahibernate.course.jpa.courseJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner
{
   // @Autowired
    //private courseJPARepository rep;

    @Autowired
    private courseSpringdataJpaRepsitory rep;

    @Override
    public void run(String ... args) throws Exception
    {
        Course c = new Course(1, "AGGGTM", "Holly Jackson");

        //rep.insert(c); //makes sure that CourseJdbcRepository's insert function is getting executed.
        //rep.insert(new Course(2, "Truly Devious", "Maureen Johnson"));
        //rep.insert(new Course(3, "One of us is Lying", "Karen McManus"));
        rep.save(c); 
        rep.save(new Course(2, "Truly Devious", "Maureen Johnson"));
        rep.save(new Course(3, "One of us is Lying", "Karen McManus"));
        System.out.println(rep.findAll());
        rep.deleteById(2l);
        //System.out.println(rep.findById(1l));
        //System.out.println(rep.findById(3L));
        System.out.println(rep.findAll());
        System.out.println(rep.count());
        System.out.println(rep.findByAuthor("Karen McManus"));
        System.out.println(rep.findByName("AGGGTM"));
    }

}


