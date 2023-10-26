import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        //1

//        System.out.print("input first number: " );
//         int num1 = S.nextInt();
//        System.out.print("input second number: " );
//        int num2 = S.nextInt();
//
//        System.out.println( num1 + " + " + num2   + " = " + (num1 + num2));
//        System.out.println(num1 + " - " + num2   + " = " + (num1 - num2));
//        System.out.println(num1 + " x " + num2   + "= " + num1 * num2 );
//        System.out.println( num1 + " / " + num2   +"= " + num1 / num2 );
//        System.out.println(num1 + " mod " + num2   + "= " + num1 % num2 );

        //2

//        System.out.println("input a number: " );
//          int num = S.nextInt();
//          for (int i = 1; i<=10 ; i++){
//              System.out.println( num + " X " + i + " = " +num * i );
//          }



        //3

//         System.out.println("Radius = " );
//         double radius = S.nextDouble();
//         double area = (3.14) * (radius * radius );
//         double perimeter = 2 * radius * 3.14;
//         System.out.println("perimeter is = " + perimeter);
//         System.out.println("Area is = " + area);



        //4
//        System.out.println("Enter the count of numbers: " );
//        int count = S.nextInt();
//        double sum = 0;
//        for (int i = 1; i<=count ; i++){
//            System.out.println("Enter an integer: " );
//            int num = S.nextInt();
//            sum+= num;
//        }
//        System.out.println("The average is:" + sum/count  );



        //5
//        System.out.print("Input the first number " );
//        int num1 = S.nextInt();
//        System.out.print("Input the second number " );
//        int num2 = S.nextInt();
//        System.out.print("Input the third number " );
//        int num3 = S.nextInt();
//        if( num1 + num2 == num3){
//            System.out.println("The result is: true" );
//        }
//        else  System.out.println("The result is: false" );


//        //6
//        System.out.println("Input a word: ");
//        String word = S.nextLine();
//        String reverse = "";
//        for (int i =word.length()-1 ; i>= 0; i--){
//            reverse+= word.charAt(i);
//        }
//        System.out.printf("Reverse word: " + reverse);


        //7
//        System.out.println("Enter a number:");
//        int num = S.nextInt();
//        if( num % 2 == 0){
//            System.out.println("The number is Even");
//        }
//        else System.out.println("The number is Odd");

        //8
//        System.out.println("Enter temperature in Centigrade: ");
//        int temperature = S.nextInt();
//        double Fahrenheit = (temperature * 1.8) + 32;
//        System.out.println("Temperature in Fahrenheit is:  " +Fahrenheit );


        //9
//        System.out.println("Input a string:  ");
//        String input = S.nextLine();
//        System.out.println("Input a number: ");
//        int num = S.nextInt();
//        System.out.print(input.charAt(num));


        //10
//        System.out.print("Width =   ");
//        double width = S.nextDouble();
//        System.out.print("Height = ");
//        double height = S.nextDouble();
//        double area = width * height;
//        double perimeter = 2 *(width + height);
//
//        System.out.println("Area is " + width + " X " + height + " = " + area );
//        System.out.println("perimeter is 2 * " + "( "+  width + " + " + height +" ) " + " = " + perimeter );

        //11
//        System.out.print("Input first integer:  ");
//        int num1 = S.nextInt();
//        System.out.print("Input second integer ");
//        int num2 = S.nextInt();
//
//        if (num1 == num2) {
//            System.out.println(num1 + "==" + num2);
//        }
//        if (num1 != num2) {
//            System.out.println(num1 + "!=" + num2);
//        }
//        if (num1 < num2) {
//            System.out.println(num1 + "<" + num2);
//        }
//        if (num1 <= num2) {
//            System.out.println(num1 + "<= " + num2);
//        }
//         if (num1 >= num2) {
//            System.out.println(num1 + "=>" + num2);
//        }
//        if (num1 > num2) {
//            System.out.println(num1 + ">" + num2);
//        }



        //12
//        System.out.print("Input seconds ");
//        int seconds = S.nextInt();
//
//        int hours = (seconds / 3600);
//        int minutes = (seconds -(3600*hours))/60;
//        int second = (seconds-(3600* hours)-(minutes*60));
//        System.out.println(hours + ":" + minutes + ":" + second );

          //13
//        System.out.print("Input first integer:  ");
//        int num1 = S.nextInt();
//        System.out.print("Input second integer ");
//        int num2 = S.nextInt();
//        System.out.print("Input third integer:  ");
//        int num3 = S.nextInt();
//        System.out.print("Input fourth integer ");
//        int num4 = S.nextInt();
//
//        if (num1 == num2 && num1 == num3 && num3 == num4){
//            System.out.print("Numbers are  equal ");
//        }
//        else System.out.print("Numbers are not equal!! ");


        //14
//        System.out.print("Input a number:  ");
//         int num = S.nextInt();
//
//         if(num  == 0){
//             System.out.println("Number is Zero ");
//         } else if (num > 0) {
//             System.out.println("Number is Positive ");
//         }
//         else System.out.println("Number is Negative ");


        //15
//        int num;
//        int countZero = 0 ;
//        int countPositives= 0;
//        int countNegatives =0 ;
//        System.out.println("enter any number");
//        do {
//            num = S.nextInt();
//             if(num  == 0){
//                 countZero++;
//         }  if (num < 0 && num != -1) {
//                 countNegatives++;
//         }
//         if( num > 0)
//             countPositives++;
//
//         }while (num != -1);
//        System.out.println("count Zero " + countZero);
//        System.out.println("count Positives " + countPositives);
//        System.out.println("count Negatives " +countNegatives);

        //16
//        System.out.println("Input a number: ");
//        int number = S.nextInt();
//        String reverse = String.valueOf(number);
//        String reverse1 ="";
//        for (int i =reverse.length()-1 ; i>= 0; i--){
//            reverse1+= reverse.charAt(i);
//        }
//        System.out.printf("Reverse number : " + reverse1);



            //17
//        System.out.print("enter the number or 0 to stop: ");
//        int num = S.nextInt();
//        int smallnumber=0;
//        int largenumber=0;
//        while (num != 0){

//                 System.out.print("enter the number or 0 to stop: ");
//
//            if( num > largenumber ){
//                largenumber = num;
//            }
//            if (num < smallnumber){
//
//                smallnumber= num ;
//            }
//             num = S.nextInt();
//            }
//        System.out.println("the small number :" + smallnumber);
//        System.out.println("the large number :" + largenumber);


        //18
//        System.out.println("Enter String:");
//        String input = S.nextLine();
//        int count = 0 ;
//        for (int i =0; i<= input.length()-1 ; i++) {
//            if (input.charAt(i) == 'a')
//                count++;
//        }
//            System.out.println("Number of a's: " + count);

    }
}