package com.example.spring.domain;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class User {
	private int id;
    private String firstname="";
    private String lastname="";
    private int age;

    public User(){};
    public User(int id, String lastname, String firstname, int age)
    {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
    }
    /**
     * Getters
     */
    public int getId()
    {
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname()
    {
        return this.lastname;
    }

    public int getAge()
    {
        return this.age;
    }


    /**
     * Setters
     */

    public void setId(int Id)
    {
        this.id=Id;
    }

    public void setFirstname(String firstname)
    {
        this.firstname=firstname;
    }

    public void setLastname(String lastname)
    {
        this.lastname= lastname;
    }

    public void setAge(int Age)
    {
        this.age=Age;
    }


}
