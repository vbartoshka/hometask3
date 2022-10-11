import java.util.Scanner;

public class Hometask3 {
    public static void main(String[] args) {
       /* задача 12
       The program requests a six-digit number and determines after the input whether the ticket
       with such number will be winning (the sum of the first three digits matches the
       sum of the last three digits).
        */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Enter value");
        String s = Integer.toString(number);
        String[] arr;
        String delimiter = "";
        arr = s.split(delimiter);
        int[] array1 = new int[6];
        for (int i = 0; i < 6; i++) {
            array1[i] = Integer.parseInt(arr[i]);
        }
        // System.out.println(Arrays.toString(arr));
        if (array1[0] + array1[1] + array1[2] == array1[3] + array1[4] + array1[5])
            System.out.println("Yes");
        else System.out.println("NO");

    /* задача 11
    Find roots of a quadratic equation and output them to the screen if there are any.
    If there are no roots, output message informing about this.
    The quadratic equation is defined by the coefficients a, b, c entered from the keyboard by the user.
    */
        System.out.println("Enter number A ");
        int a = scanner.nextInt();
        System.out.println("Enter number B ");
        int b = scanner.nextInt();
        System.out.println("Enter number C ");
        int c = scanner.nextInt();
        int discriminant = (int) Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {
            int x1 = -b + (int) Math.sqrt(discriminant) / (2 * a);
            int x2 = -b - (int) Math.sqrt(discriminant) / (2 * a);
            System.out.println("x1= " + x1 + " \nx2= " + x2);
        } else System.out.println("no roots");
        /* задача 10
        Define entrance of a nine-storey apartment building according to the specified apartment number N.
        There are M apartments on each floor.
        Output the number of the entrance to the console.
         */
        System.out.println("Enter number apartments");
        int apartments= scanner.nextInt();
        int entrance1=30,entrance2=60,entrance3=90;
        if (apartments>0 && (apartments <= entrance1))
            System.out.println("entrance number 1");
        else if(apartments>entrance1 && apartments<=entrance2)
            System.out.println("entrance number 2");
        else if(apartments>entrance2 && apartments<=entrance3)
            System.out.println("entrance number 3");
        else System.out.println("enter other number entrance");

    }

        }




