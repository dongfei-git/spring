package tech.dongfei.spring.bean;

public class User {

    private String name;

    public void add() {
        System.out.println("add user");
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
