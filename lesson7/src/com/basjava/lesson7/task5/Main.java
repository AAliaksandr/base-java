package com.basjava.lesson7.task5;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(25);
        list.add(1, 15);

      for(int i =0; i < list.size(); i++){
          System.out.println(list.get(i));
      }

        System.out.println(list.get(0));
    }
}

