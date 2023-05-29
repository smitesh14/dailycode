import java.util.Scanner;
public class class_avg {
    private String name;
    private int age;
    private int sub1,sub2;
    private char grade;
    private int totalmarks;
    
    public void intialize(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter age:");
        age=sc.nextInt();
        System.out.println("enter marks in sub1:");
        sub1=sc.nextInt();
        System.out.println("enter marks in sub2:");
        sub2=sc.nextInt();
        sc.close();
    }
    public void grader(){
        totalmarks=sub1+sub2;
        int pr=(totalmarks/2);
        if(pr>=90){
            grade='S';
        }
        else if(pr>=80){
            grade='A';
        }
        else{
            grade='f';
        }
    }
    public void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("total marks:"+totalmarks);
        System.out.println("grade:"+grade);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of std:");
        int n=sc.nextInt();
        sc.nextLine();
        class_avg[] student=new class_avg[n];
        for(int i=0;i<n;i++){
            System.out.println("enter details of student "+(i+1)+" :");
            student[i]=new class_avg();
            student[i].intialize();
            student[i].grader();
            student[i].display();
        }
        sc.close();
    }
}
