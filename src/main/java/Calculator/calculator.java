package Calculator;

import java.util.Scanner;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculator {
    private static final Logger logger = LogManager.getLogger(calculator.class);
    public double square_root(double value){
        logger.info("[Square_Root] - "+value);
        double result = Math.sqrt(value);
        logger.info("[Square_Root-Answer] - "+result);
        return result;
    }

    public long factorial(int value){
        logger.info("[Factorial] - "+value);
        int temp = value;
        long ans=1;
        while (temp>0) {
            ans *= temp;
            temp--;
        }
        logger.info("[Factorial-Answer] - "+ans);
        return ans;
    }

    public double logarithm(double value){
        logger.info("[Log] - "+value);
        double result = Math.log(value);
        logger.info("[Log-Answer] - "+result);
        return result;
    }

    public double power(double base, int exp){
        logger.info("[Power - Base] - "+base+" [Exponent] - "+exp);
        double ans=1;
        for(int i=1;i<=exp;i++){
            ans*=base;
        }
        logger.info("[Power-Answer] - "+ans);
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ------- Scientific Calculator Program ------- \n");

        boolean flag=true;

        calculator cal = new calculator();

        while (flag) {
            System.out.println("Options:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm(base e)");
            System.out.println("4. Power Function");
            System.out.println("5. Exit");

            System.out.println("Enter your choice\n:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Value: ");
                    double one = sc.nextDouble();
                    System.out.println("Answer is "+cal.square_root(one));
                    break;

                case 2:
                    System.out.println("Value: ");
                    int two = sc.nextInt();
                    System.out.println("Answer is "+cal.factorial(two));
                    break;

                case 3:
                    System.out.println("Value: ");
                    double three = sc.nextDouble();
                    System.out.println("Answer is "+cal.logarithm(three));
                    break;

                case 4:
                    System.out.println("Base: ");
                    double base = sc.nextDouble();
                    System.out.println("Power: ");
                    int power = sc.nextInt();
                    System.out.println("Answer is "+cal.power(base, power));
                    break;

                case 5:
                    flag=false;
                    break;

                default:
                    System.out.println("Please, Enter a valid choice!!");
            }
        }
    }
}
