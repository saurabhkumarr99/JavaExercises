package com.company;

import java.util.*;

class product {
    private int id;
    private String PrdName;
    private int PrdPrice;

    public String getPrdName() {
        return PrdName;
    }

    public void setPrdName(String prdName) {
        PrdName = prdName;
    }

    public void setPrdPrice(int prdPrice) {
        PrdPrice = prdPrice;
    }

    public product(int id, String PrdName, int PrdPrice) {
        this.id = id;
        this.PrdName = PrdName;
        this.PrdPrice = PrdPrice;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", PrdName='" + PrdName + '\'' +
                ", PrdPrice=" + PrdPrice +
                '}';
    }
}

public class product_todo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<product> products = new ArrayList<>();

        System.out.println("Press 1 for all Product \nPress 2 for add Product \nPress 3 for update Product \nPress 4 for delete Product \nPress 0 for exit");
        int i = sc.nextInt();
        do {

            switch (i) {
                case 1 -> System.out.println(products);
                case 2 -> {
                    System.out.println("Enter Product Name : ");
                    String PrdName = sc.next();
                    System.out.println("Enter Product price : ");
                    int PrdPrice = sc.nextInt();

                    product prd = new product(products.size()+1, PrdName, PrdPrice);
                    products.add(prd);
                    System.out.println("Product added successfully");
                }
                case 3 -> {
                    System.out.print("Enter name of Product :");
                    String name = sc.next();
                    boolean checkprd = false;
                    for (product prd : products) {
                        if (prd.getPrdName().equals(name)) {
                            System.out.println("Enter Product Name : ");
                            prd.setPrdName(sc.nextLine());
                            System.out.println("Enter Product price : ");
                            prd.setPrdPrice(sc.nextInt());
                            checkprd = true;
                            break;
                        }
                    }
                    if (checkprd) {
                        System.out.println("Product " + name + " is updated successfully");
                    } else {
                        System.out.println("No such Product exist to update .");

                    }
                }
                case 4 -> {
                    System.out.print("Enter name of employee :");
                    String name = sc.next();
                    boolean checkprd = false;
                    for (product prd : products) {
                        if (prd.getPrdName().equals(name)) {
                            products.remove(prd);
                            checkprd = true;
                            break;
                        }
                    }
                    if (checkprd) {
                        System.out.println("Product " + name + " is deleted successfully");
                    } else {
                        System.out.println("No such Product exist to delete .");

                    }
                }

                default -> System.out.println("Sorry you have enter wrong choice");
            }
            System.out.println("****************************************************");
            System.out.println("Press 1 for all Product \nPress 2 for add Product \nPress 3 for update Product \nPress 4 for delete Product \nPress 0 for exit");
            i = sc.nextInt();
        } while (i != 0);
    }
}
