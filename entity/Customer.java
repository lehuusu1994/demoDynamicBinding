package entity;

public class Customer extends User {

    private String userName;

    private String password;

    private String name;

    public Customer(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    }
}
