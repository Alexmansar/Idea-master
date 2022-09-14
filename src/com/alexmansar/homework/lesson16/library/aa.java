package com.alexmansar.homework.lesson16.library;

public class MyArrayListMain {
    public static void main(String[] args) {
        com.alexmansar.homework.homework3.MyList list = new com.alexmansar.homework.homework3.MyArrayList();
        String string;
        list.add("Hello");
        list.add("my");
        list.add("dear");
        list.add("friends!");
        list.add("How");
        list.add("are");
        list.add("you");
        list.add("?");
        System.out.println("List with use ADD method: " + list);
        System.out.println("___________________________________");
 /*       string = list.get(-15);
        System.out.println("List with use GET method, not valid index  (less than 0)- " + string);
        string = list.get(100);
        System.out.println("List with use GET method, not valid index (more than SIZE)- " + string);
*/
        string = list.get(2);
        System.out.println("List with use GET method, valid index: " + string);
        System.out.println("___________________________________");
   /*     list.set(-15, "!?!?!?!?");
        System.out.println("List with use SET method, not valid index  (less than 0): " + list);
        list.set(100, "!?!?!?!?");
        System.out.println("List with use SET method, not valid index  (more than SIZE): " + list);
   */
        list.set(5, "!?!?!?!?");
        System.out.println("List with use SET method: " + list);
        System.out.println("___________________________________");
     /*   string = list.remove(-15);
        System.out.println("Remove string is: " + string);
        System.out.println("List with use REMOVE method, not valid index  (less than 0): " + list);
        string = list.remove(-100);
        System.out.println("Remove string is: " + string);
        System.out.println("List with use REMOVE method, not valid index  (more than SIZE): " + list);
     */
        string = list.remove(0);
        System.out.println("Remove string is: " + string);
        System.out.println("List with use REMOVE method: " + list);
    }
}