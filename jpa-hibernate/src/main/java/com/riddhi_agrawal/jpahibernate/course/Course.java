package com.riddhi_agrawal.jpahibernate.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course 
{

    @Id
    private long id;

    private String name;
    
    private String author;

    public Course()
    {
        this.name="";
        this.id=0;
        this.author="";
    }
    public Course(long id , String name , String author)
    {
        super();
        this.name=name;
        this.author=author;
        this.id=id;
    }

    public String getName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public long getId()
    {
        return id;
    }

    public String toString()
    {
        return  "\nID : "+id+" \nName : "+name+" \nAuthor : "+author;
    }

    public void setId(long id)
    {
        this.id=id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    } 
}

