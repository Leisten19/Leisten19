
package Leisten19;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Tomas"); // P� index 0
        nameList.add("Johan"); // P� index 1
        nameList.add(1, "Edvin"); // P� index 1 l�gger till Edvin

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));

        }
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
            
            nameList.remove("Tomas");


    }

}
}
