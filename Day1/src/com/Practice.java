package com;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
 class Person
    {
     
        private String name;
        private int roll_num;
        public Person(String name,int roll_num){
            this.name=name;
            this.roll_num=roll_num;
        }
        public int getRoll_num(){
            return roll_num;
        }
        
        @Override
        public String toString() {
            return name + ": " + roll_num;
        }
        
    }
public class Practice {
    public static void main(String[] args) {
    
        ArrayList<Person> a=new ArrayList<>();
        a.add(new Person("john",25));
        a.add(new Person("barb",126));
        a.add(new Person("charles",28));
        a.add(new Person("darwin",142));
        a.add(new Person("anglo",152));
       
 //    ArrayList<Person> b=new ArrayList<>();
//        for(Person i:a)
//        {
//            int roll=i.getRoll_num();
//            if(roll%2==0)
//            {
//                if(roll>=121 && roll<=150)
//                {
//                    b.add(i);
//                }
//            }
//        }
//        
//        for(Person i:b)
//        {
//            System.out.println(i);
//        }
//        
        //using stream
        
        List<Person> b=a.stream()
        		.filter(p->p.getRoll_num()%2==0)
        		.filter(p->p.getRoll_num() >= 121 && p.getRoll_num() <= 150)
        		.collect(Collectors.toList());
        
        b.forEach(n->System.out.println(n));
    }
}