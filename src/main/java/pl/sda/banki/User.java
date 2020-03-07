package pl.sda.banki;

public class User {
    private String name;
    private String lastname;
    private int age;
    private BankAccount bank;

    public User(String name, String lastname, int age, BankAccount bank) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.bank = bank;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BankAccount getBank() {
        return bank;
    }

    public void setBank(BankAccount bank) {
        this.bank = bank;
    }
}

