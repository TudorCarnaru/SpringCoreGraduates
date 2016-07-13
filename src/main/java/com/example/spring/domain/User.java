package com.example.spring.domain;

public class User {
	private int id;
    private String firstname="";
    private String lastname="";
    private int age;


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
