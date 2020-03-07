package pl.sda.banki;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1,"BankDlaBogatych",43211, 2832832);
        BankAccount acc2 = new BankAccount(2,"BankNowoczesny",232321,3233233);
        BankAccount acc3 = new BankAccount(3,"Bank",4332221,42324555);
        BankAccount acc4 = new BankAccount(4,"BigBank",444444,5444333);

        User user1 = new User("Jan", "Kowalski",44,acc1);
        User user2 = new User("Marcin", "Nowak",66,acc2);
        User user3 = new User("Katarzyna","Dobroń", 33,acc3);
        User user4 = new User("Ola", "Lewandowska",33,acc4);

        System.out.println("Imie: "+user1.getName());
        System.out.println("Naziwsko: "+user1.getLastname());
        System.out.println("Wiek"+user1.getAge());
        System.out.println("Nazwa Banku: "+user1.getBank().getName());
        System.out.println("Numer konta: "+user1.getBank().getAccountNumber());
        System.out.println("Saldo konta: "+user1.getBank().getBalance());


        List<User> users = new ArrayList<User>();
           users.add(user1);
           users.add(user2);
           users.add(user3);
           users.add(user4);

           ObjectMapper objectMapper = new ObjectMapper();


           try {

            objectMapper.writeValue(new File("user.JSON"),users);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


