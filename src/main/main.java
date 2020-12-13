package main;

import derived.other;
import java.util.*;

public class main {
    public static void main(String[] args) {
        other o = new other();
        Scanner sc = new Scanner(System.in);
        System.out.print("Would u like to create an account, yes or no? ");
        String answer = sc.nextLine();
        System.out.println();
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("To create an account fill the details.");
            o.createAccount();
            o.accountNo();
            o.firstDeposit();
            o.successfully();
            System.out.println();
            System.out.print("Would u like to do transactions,Press 'Y' for yes And 'N' for No: ");
            String answer3 = sc.nextLine();
            System.out.println();
            if(answer3.equalsIgnoreCase("Y")){
                o.instructions();
                o.check();
                String answer1 = sc.nextLine();
                if (answer1.equalsIgnoreCase("d")){
                    o.deposit();
                    o.printDeposit();
                }
                else if (answer1.equalsIgnoreCase("w")){
                    o.withdrawal();
                    o.printWithdraw();
                }
                else if(answer1.equalsIgnoreCase("ac")){
                    o.display();
                }
                else if(answer1.equalsIgnoreCase("c")){
                    System.out.println("\nThank you for wasting your time.");
                }
                else{
                    System.out.println("Wrong key.");
                }
                System.out.print("\nWould u like to do transaction again? Y or N? ");
                String ans = sc.nextLine();
                while(!ans.equalsIgnoreCase("N")){
                    o.instructions();
                    o.check();
                    answer1 = sc.nextLine();
                    if(answer1.equalsIgnoreCase("d")){
                        o.deposit();
                        o.printDeposit();
                    }
                    else if (answer1.equalsIgnoreCase("w")){
                        o.withdrawal();
                        o.printWithdraw();
                    }
                    else if(answer1.equalsIgnoreCase("ac")){
                        o.display();
                    }
                    else if(answer1.equalsIgnoreCase("c")){
                        System.out.println("\nThank you for wasting your time.");
                    }
                    else{
                        System.out.println("Wrong key.");
                    }
                    System.out.print("\nWould u like to do transaction again? Y or N? ");
                    ans = sc.nextLine();

                }
                System.out.println("Thank you.");
            }
            else{
                System.out.println("Thank you.");
            }
        }
        else{
            System.out.println("\nThank you for wasting your time.");
        }

    }
}
