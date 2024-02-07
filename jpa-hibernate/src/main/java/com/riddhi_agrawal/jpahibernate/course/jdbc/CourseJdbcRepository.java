package com.riddhi_agrawal.jpahibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.riddhi_agrawal.jpahibernate.course.Course;

@Repository
public class CourseJdbcRepository 
{
    @Autowired
    private JdbcTemplate springjdbctemplate;

    private static String insert_query =
    """
        insert into course(id , name , author) values (?,?,?);
    """;

    private static String delete_query= 
    """
            delete from course where id = ?;
    """;

    private static String select_query=
    """
            select * from course where id=?;
    """;
     
    public void insert(Course c)
    {
        springjdbctemplate.update(insert_query,c.getId(),c.getName(),c.getAuthor());
    } 

    public void deleteById(long id)
    {
        springjdbctemplate.update(delete_query, id);
    }

    public Course findById(long id)
    {
        return springjdbctemplate.queryForObject(select_query, new BeanPropertyRowMapper<>(Course.class),id);
    }
}


