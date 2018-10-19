import java.util.Scanner;
public class SciCalculator
{

    public static void main(String[] args){

        {
            Scanner input = new Scanner(System.in);//calls scanner and names it Input
            double firstoperand;
            double secondoperand;
            double sum;
            double difference;
            double product;
            double quotient;
            double exponent;
            double log;
            double totalSum = 0;
            double totalDifference = 0;
            double totalProduct = 0;
            double totalQuotient = 0;
            double totalExponent = 0;
            double totalLog = 0;
            double SumCalc = 0;
            int CalcNumber = 0;
            double AvgCalc;
            double selection;
            boolean runprogram = true; //initializes the loop as runprogram and sets it to true

            System.out.print("Current Result: 0.0");
            System.out.print("\n\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average");

            while (runprogram)
            {

                System.out.print("\n\nEnter Menu Selection: ");
                selection = input.nextInt();

                if (selection == 0)
                {
                    System.out.println("\nThanks for using this calculator. Goodbye!\n ");
                    break;//terminates the loop
                } else if (selection == 1)
                {
                    System.out.print("Enter first operand: ");
                    firstoperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondoperand = input.nextDouble();
                    sum = firstoperand + secondoperand;
                    totalSum += sum;//sets the total sum equal to the sum and adds the sum to the totalsum to create a new total sum
                    System.out.println("\nCurrent Result: " + sum);
                    CalcNumber++;
                    System.out.print("\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average");
                } else if (selection == 2)// this line of code is used only if the user inputs the number 2
                {
                    System.out.print("Enter first operand: ");
                    firstoperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondoperand = input.nextDouble();
                    difference = firstoperand - secondoperand;
                    totalDifference += difference;
                    System.out.println("\nCurrent Result: " + difference);
                    CalcNumber++;//adds 1 to the CalcNumber
                    System.out.print("\n\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average");
                } else if (selection == 3)
                {
                    System.out.print("Enter first operand: ");
                    firstoperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondoperand = input.nextDouble();
                    product = firstoperand * secondoperand;//makes the product equal to the multiplication of the 2 inputs
                    totalProduct += product;
                    System.out.println("\nCurrent Result: " + product);
                    CalcNumber++;
                    System.out.print("\n\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average");
                } else if (selection == 4)
                {
                    System.out.print("Enter first operand: ");
                    firstoperand = input.nextDouble();//allows user to input a double
                    System.out.print("Enter second operand: ");
                    secondoperand = input.nextDouble();
                    quotient = firstoperand / secondoperand;
                    totalQuotient += quotient;
                    System.out.println("\nCurrent Result: " + quotient);
                    CalcNumber++;
                    System.out.print("\n\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average");
                } else if (selection == 5)
                {
                    System.out.print("Enter first operand: ");
                    firstoperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondoperand = input.nextDouble();
                    exponent = Math.pow(firstoperand, secondoperand);
                    totalExponent += exponent;
                    System.out.println("\nCurrent Result: " + exponent);
                    CalcNumber++;
                    System.out.print("\n\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average");
                } else if (selection == 6)
                {
                    System.out.print("Enter first operand: ");
                    firstoperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    secondoperand = input.nextDouble();
                    log = Math.log(secondoperand) / Math.log(firstoperand);
                    totalLog += log;
                    System.out.println("\nCurrent Result: " + log);
                    CalcNumber++;
                    System.out.print("\n\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average");
                } else if (selection == 7)
                {
                    if (CalcNumber == 0)
                    {
                        System.out.println("\nError: No calculations yet to average!");
                    } else
                    {
                        SumCalc = totalSum + totalDifference + totalProduct + totalQuotient + totalExponent + totalLog;
                        AvgCalc = SumCalc / CalcNumber;
                        System.out.println();
                        System.out.println("Sum of calculations: " + SumCalc);
                        System.out.println("Number of calculations: " + CalcNumber);
                        System.out.printf("Average of Calculations: %.2f%", AvgCalc);
                        System.out.print("\n\nCalculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average");
                    }
                } else
                {
                    System.out.print("\nError: Invalid selection!");
                }
            }

        }
    }
}


