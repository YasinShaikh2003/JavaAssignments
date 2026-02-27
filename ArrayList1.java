//write a java program to accept 'n' integers from the user & store them in an ArrayList Collection. Display the elements of ArrayList Collection In Reverse Order.

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class ArrayList1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer>list = new ArrayList<Integer>();
        System.out.println("Eneter the how many number: ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println("Enter number"+(i+1)+":");
            int num = sc.nextInt();
            list.add(num);
        }
        Collections.reverse(list);

        System.out.println("number in reverse order: ");
        System.out.println(list);

        sc.close();
    }
}