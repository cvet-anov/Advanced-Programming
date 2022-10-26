package LaboratoryExercise1;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RomanConverterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        IntStream.range(0, n)
                .forEach(x -> System.out.println(RomanConverter.toRoman(scanner.nextInt())));
        scanner.close();
    }
}


class RomanConverter {

    /**
     * Roman to decimal converter
     *
     * @param n number in decimal format
     * @return string representation of the number in Roman numeral
     */
    public static String toRoman(int n) {
        // your solution here
        while (n>0){
            while (n>=1000)
            {
                n-=1000;
                System.out.print("M");
            }
            while (n>=900)
            {
                n-=900;
                System.out.print("CM");
            }
            while (n>=500){
                n-=500;
                System.out.print("D");
            }
            while (n>=400)
            {
                n-=400;
                System.out.print("CD");
            }
            while (n>=100)
            {
                n-=100;
                System.out.print("C");
            }
            while (n>=90)
            {
                n-=90;
                System.out.print("XC");
            }
            while (n>=50)
            {
                n-=50;
                System.out.print("L");
            }
            while (n>=40)
            {
                n-=40;
                System.out.print("XL");
            }
            while (n>=10)
            {
                n-=10;
                System.out.print("X");
            }
            while (n>=9)
            {
                n-=9;
                System.out.print("IX");
            }
            while (n>=5)
            {
                n-=5;
                System.out.print("V");
            }
            while (n>=4)
            {
                n-=4;
                System.out.print("IV");
            }
            while (n>=1)
            {
                n-=1;
                System.out.print("I");
            }


        }


        return "";
    }

}
