package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class employee_pojo {
    private int empId;
    private String name;
    private String address;
    private int mob;
    private int age;



    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public employee_pojo() {

    }

    public employee_pojo(int empId, String name, String address, int mob, int age) {
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.mob = mob;
        this.age = age;
    }

    @Override
    public String toString() {
        return "employee_pojo{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mob=" + mob +
                ", age=" + age +
                '}' + "\n";
    }
}

public class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome for using Employee Managment Software");
        System.out.println("****************************************************");
        ArrayList<employee_pojo> emp = new ArrayList<>();

        System.out.println("Press 1 for all Employee \nPress 2 for add Employee \nPress 3 for update Employee \nPress 4 for delete Employee \nPress 0 for exit");
        int i = sc.nextInt();
        do {

            switch (i) {
                case 1 -> System.out.println(emp);
                case 2 -> {
                    System.out.print("Enter Employee name   :");
                    String name = sc.next();
                    System.out.print("Enter Employee address:");
                    String addr = sc.next();
                    System.out.print("Enter Employee age   :");
                    int age = sc.nextInt();
                    System.out.print("Enter Employee mobile :");
                    int mob = sc.nextInt();
                    employee_pojo employee = new employee_pojo(emp.size() + 1, name, addr, mob, age);
                    emp.add(employee);
                    System.out.println("Employee added successfully");
                }
                case 3 -> {
                    System.out.print("Enter name of employee :");
                    String name1 = sc.next();
                    boolean checkEmp = false;
                    for (employee_pojo e : emp) {
                        if (e.getName().equals(name1)) {
                            System.out.print("Enter Employee name   :");
                            e.setName(sc.next());
                            System.out.print("Enter Employee address:");
                            e.setAddress(sc.next());
                            System.out.print("Enter Employee age   :");
                            e.setAge(sc.nextInt());
                            System.out.print("Enter Employee mobile :");
                            e.setMob(sc.nextInt());

                            checkEmp = true;
                            break;
                        }
                    }
                    if (checkEmp) {
                        System.out.println("Employee " + name1 + " is updated successfully");
                    } else {
                        System.out.println("No such employee exist to update .");

                    }
                }
                case 4 -> {
                    System.out.print("Enter name of employee :");
                    String name2 = sc.next();
                    boolean checkEmp = false;
                    for (employee_pojo e : emp) {
                        if (e.getName().equals(name2)) {
                           emp.remove(e);
                            checkEmp = true;
                            break;
                        }
                    }
                    if (checkEmp) {
                        System.out.println("Employee " + name2 + " is deleted successfully");
                    } else {
                        System.out.println("No such employee exist to delete .");

                    }
                }

                default -> System.out.println("Sorry you have enter wrong choice");
            }
            System.out.println("****************************************************");
            System.out.println("Press 1 for all Employee \nPress 2 for add Employee \nPress 3 for update Employee \nPress 4 for delete Employee \nPress 0 for exit");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("****************************************************");
        System.out.println("Thanks for using Employee Managment Software");

    }
}




