package com.riddhi_agrawal.jpahibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.riddhi_agrawal.jpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class courseJPARepository 
{
    @PersistenceContext
    private EntityManager em;

    public void insert(Course c)
    {
        em.merge(c);
    }

    public void deleteById(long id)
    {
        Course c = em.find(Course.class , id);
        em.remove(c);

    }

    public Course findById(long id)
    {
        return em.find(Course.class, id);
    }
}
