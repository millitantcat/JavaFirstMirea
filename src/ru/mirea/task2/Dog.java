package ru.mirea.task2;

public class Dog
{
    private int age;
    private String name;

    public Dog(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)

    {
        this.age = age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int toHumanAge()
    {
        return (age*7);
    }

    @Override
    public String toString() {
        return "Dog name is " +name+ " and age is " +age+ ". Age in human years is " +this.toHumanAge()+ ".";
    }
}