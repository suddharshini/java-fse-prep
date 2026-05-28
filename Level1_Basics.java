/*
LEVEL 1 — Basics + Logic
  Print / Variables / Input
  Print your name, college, and CGPA.
  Swap two numbers.
  Convert Celsius to Fahrenheit.
  Find simple interest.
  Find compound interest.
  Calculate area of circle.
  Convert seconds into hours, minutes, seconds.
*/

import java.util.*;
  public class Main{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      String name = sc.nextLine();
      sc.nextLine();
      String college_name=sc.nextLine();
      String cgpa = sc.nextLine();
      System.out.println("Name :"+name);
      System.out.println("college Name:"+college_name);
      System.out.println("Cgpa :"+cgpa);

      static void swapNumb(){
        int a =10;
        int b=20;
        int temp = a;
        int a= b;
        int b = temp;
        System.out.println("After swapping :");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
      }
      swapNumb();

      static void celciousToFahrenheit(){
        double celcious = 37;
        double fahrenheit  = (celcious*9/5) + 32;
        System.out.println("Celcious : 37 => Fahrenheit :" fahrenheit);
      }
      celciousToFahrenheit();

      static void simpleInterest(){
        int p=5000;
        int n = 2;
        int r = 10;
        int simple_interest =(int)((p*n*r)/100);
        System.out.println(simple_interest);
      }
      simpleInterest();

      static void compoundInterest(){
        int p=5000;
        int n = 2;//compounding period 
        int t = 3;//number of years
        double r = 0.05;
        double amt = p * Math.pow((1+(r/n)),n*t);
        int compound_interest = amt - p;
        System.out.println(compound_interest);
      }
      compoundInterest();  

      static void areaOfCircle(){
        int r = 10;
        int area = (int)(22/7) * r * r;
        System.out.println("Cirle's area with radius 10 : "+area);
      }
      areaOfCircle();

      static void timeConversion(){
        int hr = 2;
        int min = hr*60;
        int sec = hr*3600;
        System.out.println("Hour :"+hr);
        System.out.println("Minutes :"+min);
        System.out.println("Seconds :"+sec);
      }
      timeConversion();
    }
  }
        
      
    
