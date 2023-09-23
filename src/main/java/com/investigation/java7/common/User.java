package com.investigation.java7.common;

import java.util.Objects;

public class User implements Comparable<User> {
    private Integer id;
    private String name;
    private Integer age;

    public User() { }

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return Objects.equals(this.getId(), user.getId())
                && Objects.equals(this.getName(), user.getName())
                && Objects.equals(this.getAge(), user.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getName(), this.getAge());
    }

    @Override
    public int compareTo(User user) {
        return this.getAge().compareTo(user.getAge());
    }
}