package service;

import entity.Admin;
import entity.Customer;
import entity.Seller;
import entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    private static User[] users;
    private static List<User> users2;

    static{
        users = new User[10];
        users2 = new ArrayList<>();
    }

    public static void loopArray(){
        for(int index =0; index<users.length; index++){
            System.out.println(users[index]);
        }
        for(User user : users){
            System.out.println(user);
        }

    }
    
    public static void addListUser(){
        User user;

        Scanner sc = new Scanner(System.in);
        int index =0;
        while(index < 10){
            String input = sc.nextLine();

            switch (input){
                case "Customer" : {
                    user = inputCustomer();
                    break;
                }
                case "Admin" : {
                    user= new Admin();
                    break;
                }
                case "Seller" : {
                    user= new Seller();
                    break;
                }
                default:{
                    user = new User();
                }
            }

            UserService.addToArray(user, index);
            index ++;
        }
    }

    public static void addToArray(User user, int index){
        users[index] = user;
        users2.add(user);
        System.out.println(users);
    }

    public static User getUser(int index){
        //return users[index];
        return users2.get(index);
    }

    private static Customer inputCustomer(){
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        String password = sc.nextLine();
        String name = sc.nextLine();
        Customer kietLon = new Customer(userName, password, name);
        return kietLon;
    }

}
