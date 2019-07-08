import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        //Creating a new scanner for reading input from console
        Scanner sc = new Scanner(System.in);

        //Startup message
        System.out.println("\nType 1 to add a value to the end of the array \nType 2 to remove a value from the end of the array \nType 3 to insert a value into a part of the array");

        //Scanning the response to my startup message
        String input = (sc.next());

        //If they want to add a value
        if (input.equals("1")) {

            //Defining and outputting our array
            String[] myArray = {"Rocky Road", "Cookies and Cream", "Birthday Cake"};
            System.out.println(Arrays.toString(myArray));

            //Creating a new array list since you can't add onto an array
            ArrayList<String> newList = new ArrayList<>(Arrays.asList(myArray));

            //Asking user to input a value
            System.out.println("Enter an ice cream flavor to add to the end of the array:");
            //Scanning their response
            String line = sc.next();

            //making it easier to understand
            System.out.println("Adding that value to the array...");

            //Adding the value they entered
            newList.add(line);
            myArray = newList.toArray(myArray);
            //Printing the array with the value they entered.
            System.out.println(Arrays.toString(myArray));

            //if they want to remove a value
        } else if (input.equals("2")) {

            //Printing out the original array
            String[] myArray = {"Rocky Road", "Cookies and Cream", "Birthday Cake"};
            System.out.println(Arrays.toString(myArray));

            //Shortening the array (deleting the final item)
            String[] removedValue = Arrays.copyOf(myArray, 2);

            //Making it easier to understand
            System.out.println("Removing the final value from the array...");

            //Printing out the new array without the final value
            System.out.println(Arrays.toString(removedValue));

            //if they want to insert a value into a part of the array
        } else if (input.equals("3")) {

            //Printing initial Array
            System.out.println("[Rocky Road, Cookies and Cream, Birthday Cake]");

            //Asking user to type a value
            System.out.println("\nEnter an ice cream flavor (No Spaces!)");

            //Scanning the response to my startup message
            String line = (sc.next());

                //Asking user where they want to insert value
                System.out.println("\nWhere would you like the value inserted in your array? 0=(start), 1=(second), 2=(third), 3=(last)");

                //Scanning for the next integer
                int insert = (sc.nextInt());

                //A message to make things more organised.
                System.out.println("\nAdding value into array...");

                //Creating the ArrayList
                List list = new ArrayList();
                list.add("Rocky Road");
                list.add("Cookies and Cream");
                list.add("Birthday Cake");
                //Inserting users responses into ArrayList
                list.add(insert, line);

                //Printing the list
                System.out.println(list);
        }
    }
}

