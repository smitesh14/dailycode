import java.util.Scanner;
interface arthi{
    public void add(int x,int y);
    public void sub(int x,int y);
    //public void mul(int x,int y);
    //public void div(int x,int y);
}
public class calc implements arthi {
    public  void add(int x,int y){
        System.out.println(x+"+"+y+"="+(x+y));
    }
    public void sub(int x,int y){
        System.out.println(x+"-"+y+"="+(x-y));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("a:");
        int a=sc.nextInt();
        System.out.println("b :");
        int b=sc.nextInt();
        System.out.println("enter opertn:");
        char op=sc.next().charAt(0);
        calc obj=new calc();
        if(op=='+'){
            obj.add(a,b);
        }
        else if(op=='-'){
            obj.sub(a,b);
        }
        sc.close();
    }
}
