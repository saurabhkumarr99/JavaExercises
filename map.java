package com.company;
import java.util.*;

public class map {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
       System.out.print("Enter no. of element :");
        int n=sc.nextInt();
        LinkedHashMap <String ,Integer> map=new LinkedHashMap<>();

       for(int i=0;i<n;i++){
            String key =sc.next();
            int value =key.length();
            map.put(key,value);
        }

        System.out.println((map));

        Set<String> keys =map.keySet();
        System.out.println(keys);

        Collection<Integer> values=map.values();
        System.out.println(values);

        for(Map.Entry<String,Integer> entry : map.entrySet() ){
            System.out.println("Key :"+entry.getKey() +","+ " Value :"+entry.getValue());
        }

        for(String key : map.keySet()){
            System.out.println("Key :"+key + " value :"+map.get(key));
        }
        for(Integer value : map.values()){
            System.out.println("Value :"+value);
        }

        ArrayList<Integer> v = new ArrayList<>();
        for(Integer value : map.values()){
            v.add(value);
        }
        Collections.sort(v);
        int x=v.get(v.size()-3);

        for(Map.Entry<String,Integer> entry : map.entrySet() ){
           if(x==entry.getValue()){
               System.out.println("Third largest  number is :"+entry.getKey() +" with length :"+entry.getValue());
               return;
           }
        }

    }
}
