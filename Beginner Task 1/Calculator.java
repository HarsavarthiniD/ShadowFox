import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enhanced Console-based Calculator");
            System.out.println("1.Basic Arithmetic Operations");
            System.out.println("2.Scientific Calculations");
            System.out.println("3.Unit Conversions");
            System.out.println("4.Exit");
            System.out.println("Please select an option");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                performArithmeticOperations(sc);
                break;
                case 2:
                performScientificCalculations(sc);
                break;
                case 3:
                performUnitConversions(sc);
                break;
                case 4: 
                System.out.println("Exiting Calculator.");
                break;
                default:
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }while(choice!=4);
    }
    private static void performArithmeticOperations(Scanner sc){
        System.out.println("Basic Arithmetic Operations");
        System.out.print("Enter first number:");
        double num1=sc.nextDouble();
        System.out.print("Enter second number:");
        double num2=sc.nextDouble();
        System.out.println("Choose an operations:");
        System.out.print("1.Addition");
        System.out.print("2.Subtraction");
        System.out.print("3.Multiplication");
        System.out.print("4.Division\n");
        int operation=sc.nextInt();
        switch(operation){
            case 1:
            System.out.println("Addition: "+(num1+num2));
            break;
            case 2:
            System.out.println("Subtraction: "+(num1-num2));
            break;
            case 3:
            System.out.println("Multiplication: "+(num1*num2));
            break;
            case 4:
            if(num2!=0)
                System.out.println("Division: "+(num1/num2));
            else
                System.out.println("Error:Cannot divide by zero.");
            break;
            default:
            System.out.println("Invalid Operation.");        
        }
    }
    private static void performScientificCalculations(Scanner sc){
        System.out.println("Scientific Calculations");
        System.out.println("Choose a Calculation:");
        System.out.println("1.Square Root");
        System.out.println("2.Exponentiation");
        int calculation=sc.nextInt();
        switch(calculation){
            case 1:
            System.out.println("Enter a number:");
            double num=sc.nextDouble();
            if(num<0)
                System.out.println("Error:Cannot compute the square root for the negative number.");
            else
                System.out.println("Square Root: "+Math.sqrt(num));
            break;
            case 2:
            System.out.println("Enter the base:");
            double base=sc.nextDouble();
            System.out.println("Enter the exponent:");
            double exponent=sc.nextDouble();  
            System.out.println("Exponentiation: "+Math.pow(base,exponent));
            break;
            default:
            System.out.println("Invalid Choice.");      
        }
    }
    private static void performUnitConversions(Scanner sc){
        System.out.println("Unit Conversions");
        System.out.println("Choose a conversion:");
        System.out.println("1.Temperature(celsius to Fahrenheit)");
        System.out.println("2.Currency(USD to EUR)");
        int conversion=sc.nextInt();
        switch(conversion){
            case 1:
            System.out.println("Choose conversion type:");
            System.out.println("1.Celsius to Fahrenheit");
            System.out.println("2.Fahrenheit to Celsius");
            int temp=sc.nextInt();
            if(temp==1){
                System.out.println("Enter temperature in Celsius: ");
                double celsius=sc.nextDouble();
                System.out.println(celsius+"°C = "+(celsius * 9/5 + 32)+"°F");
            }else{
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                System.out.println(fahrenheit+"°F = " + ((fahrenheit - 32) * 5/9) + " °C");
            }
            break;
            case 2:
            System.out.println("Choose conversion type:");
            System.out.println("1. USD to EUR");
            System.out.println("2. EUR to USD");
            int currencyChoice = sc.nextInt();
            if (currencyChoice == 1) {
                System.out.print("Enter amount in USD: ");
                double usd = sc.nextDouble();
                System.out.println(usd + " USD = " + (usd * 0.85) + " EUR");
            } else if (currencyChoice == 2) {
                System.out.print("Enter amount in EUR: ");
                double eur = sc.nextDouble();
                System.out.println(eur + " EUR = " + (eur * 1.18) + " USD");
            } else {
                System.out.println("Invalid choice.");
            }
                break;
            default:
             System.out.println("Invalid conversion choice.");
        }
    }
}