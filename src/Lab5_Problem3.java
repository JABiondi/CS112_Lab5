//Author: James Biondi
//Purpose:
import java.util.Scanner;
import java.util.ArrayList;
public class Lab5_Problem3 {
    public static void reverse(ArrayList ary){

        for(int i = 0; i < ary.size()-1; i++){
            ary.add(i, ary.get(ary.size()-1)); //adds the last element of the list to the correct spot
            ary.remove(ary.size()-1);    //removes the last element of the list after it is moved

        }


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> ary = new ArrayList<>();
        do {
            System.out.println("Enter a non-zero number. Enter zero to continue: ");
            ary.add(input.nextInt());
        }while(ary.get(ary.size()-1) != 0);
        ary.remove(ary.size()-1); //takes the 0 off of the end of the list

        for (int num : ary) {
            System.out.print(num + ", "); //before
        }

        reverse(ary);                     //function call


        System.out.println("\n");         //after
        for (int num : ary) {
            System.out.print(num + ", ");
        }


    }
}
