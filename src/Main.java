import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //1. Дано трехзначное число. Вывести число, полученное при прочтении исходного числа справа налево.
        System.out.println("Task 1, enter three digit number");
        Scanner scanner = new Scanner (System.in);
        int digits = scanner.nextInt();
        int a,b,c;
        a=digits/100;
        b=digits%100/10;
        c=digits%10;
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);


        //2. Дано трехзначное число. В нем зачеркнули первую слева цифру и приписали ее справа. Вывести полученное число.
        System.out.println("Task 2, enter three digit number");
        int z1,z2, x= scanner.nextInt();
        z2=x/100;
        z1=x%100;
        System.out.print(z1);
        System.out.println(z2);

        /* 3. Дано трехзначное число. Вывести число, полученное при перестановке цифр сотен и десятков исходного числа (например,
                123 перейдет в 213).
        */
        System.out.println("Task 3, enter three digit number");
        int a1=scanner.nextInt(),a2,a3,a4;
        a2=a1/100;
        a3=a1%100/10;
        a4=a1%10;
        System.out.print(a3);
        System.out.print(a2);
        System.out.println(a4);

        //4.Дано трехзначное число. Заменить в нем вторую цифру, если она является четной, на ближайшую большую нечетную цифру.
        System.out.println("Task 4, enter three digit number");
        int q=scanner.nextInt(),q1,q2;
        q1=q%100;
        q2=q1/10;
        if (q2%2==0)
            q+=10;
        System.out.println(q);

        //5. Дано трехзначное число. Изменить одну его цифру так, чтобы оно стало палиндромом (одинаково читается справа налево и слева направо).
        System.out.println("Task 5, enter three digit number");
        int e=scanner.nextInt(),e1,e2,e3;
        e1=e/100;
        e2=e%100/10;
        e3=e%10;
        if(e1!=e3)
            e1=e3;
        System.out.print(e1);
        System.out.print(e2);
        System.out.println(e3);

        //6.Дано трехзначное число. Определить, является ли его число десятков четным числом.
        System.out.println("Task 6, enter three digit number");
        int r=scanner.nextInt(),r2;
        r2=r/10;
        if(r2==0)
            System.out.println("even");

        //7.Дано трехзначное число. Определить, является ли его число сотен нечетным числом.
        System.out.println("Task 7, enter three digit number");
        int t=scanner.nextInt(),t2;
        t2=t/100;
        if(t%2>0)
            System.out.println("odd number");

        //8.Определить, является ли введенное трехзначное число палиндромом (одинаково читается справа налево и слева направо).
        System.out.println("Task 8, enter three digit number");
        int m=scanner.nextInt(),m1,m2,m3;
        m1=m/100;
        m2=m%100/10;
        m3=m%10;
        if(m1==m2)
            System.out.println("true");

        //9.Дано целое число, большее 999. Найти цифру, соответствующую разряду сотен в записи этого числа.
        System.out.println("Task 9, enter digit");
        int f=scanner.nextInt(),f1;
        f1=f/100%10;
        System.out.println("number is "+f1);

        //10. Дано трехзначное число. Определить разность между этим числом и числом, записанным из тех же цифр, но в обратном порядке.
        System.out.println("Task 10, enter three digit number");
        int numb=scanner.nextInt(),numb1,numb3;
        String numb2=Integer.toString(numb);
        StringBuilder numb5 =new StringBuilder(numb2);
        numb5.reverse();
        int numb6=Integer.parseInt(String.valueOf(numb5));
        numb3=numb-numb6;
        System.out.println(numb3);

        //11. Дано трехзначное число. Округлить его до десятков.
        System.out.println("Task 11, enter three digit number");
        int tree = scanner.nextInt(),tree1;
        tree1=tree%10;
        if(tree1>=5)
            tree=+10;
        System.out.println(tree);

        //12. Дано трехзначное число. Округлить его до сотен.
        System.out.println("Task 12, enter three digit number");
        int v=scanner.nextInt(),v1;
        v1=v%100/10;
        if(v1>=5)
            v=+100;
        System.out.println(v);

        //13 Может ли конь переместиться с первой на вторую клетку?
        System.out.println("TASK 13,enter 'x1'");
        int x1=scanner.nextInt();
        System.out.println("enter 'y1'");
        int y1=scanner.nextInt();
        boolean bishop=false;
        if(x1<=8 && y1==0 ||x1==0 &&y1<=8 )
            System.out.println(bishop=true);

        //12. Может ли король переместиться с первой на вторую клетку?
        System.out.println("enter 'x1'");
        int xx1=scanner.nextInt();
        System.out.println("enter 'y1'");
        int yy1=scanner.nextInt();
        boolean king = false;
        if(xx1==1 && yy1==0 || xx1==0 && yy1==1)
            System.out.println(king=true);


    }

}