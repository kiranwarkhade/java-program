package practice;

import java.util.Arrays;

//Author- kiran
public class SortStringChar {
    public static void main(String[] args) {
        String str="javaprogram";
        System.out.println("String Characters: "+ str);
        //1st approach
        char arr[]=str.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorting String Characters: "+ new String(arr));
        System.out.println("----------------------------------------------");
        //2nd approach
        String str1="rock";
        System.out.println("String Characters: "+ str1);
        char[] charArray=str1.toCharArray();
        Arrays.sort(charArray);
        System.out.println("Sorting String Characters: "+ new String(charArray));

    }
}


