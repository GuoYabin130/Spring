package com.baizhi.entity;

import java.util.*;

public class User {
    private String id;
    private String name;
    private String password;
    private String age;
    private String[] names;
    private List<String> ls;
    private Set<String> ss;
    private Map<String, String> mm;
    private Properties properties;

    public User() {
    }

    public User(String id, String name, String password, String age, String[] names, List<String> ls, Set<String> ss, Map<String, String> mm, Properties properties) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.names = names;
        this.ls = ls;
        this.ss = ss;
        this.mm = mm;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<String> getLs() {
        return ls;
    }

    public void setLs(List<String> ls) {
        this.ls = ls;
    }

    public Set<String> getSs() {
        return ss;
    }

    public void setSs(Set<String> ss) {
        this.ss = ss;
    }

    public Map<String, String> getMm() {
        return mm;
    }

    public void setMm(Map<String, String> mm) {
        this.mm = mm;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(password, user.password) &&
                Objects.equals(age, user.age) &&
                Arrays.equals(names, user.names) &&
                Objects.equals(ls, user.ls) &&
                Objects.equals(ss, user.ss) &&
                Objects.equals(mm, user.mm) &&
                Objects.equals(properties, user.properties);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, name, password, age, ls, ss, mm, properties);
        result = 31 * result + Arrays.hashCode(names);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", names=" + Arrays.toString(names) +
                ", ls=" + ls +
                ", ss=" + ss +
                ", mm=" + mm +
                ", properties=" + properties +
                '}';
    }
}
