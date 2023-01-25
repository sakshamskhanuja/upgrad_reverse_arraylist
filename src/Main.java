import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        list = reverseArrayList(list);
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }

    // Method to reverse the ArrayList
    static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        // Write your code here
        StringBuilder builder = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            builder.append(list.get(i)).append(" ");
        }
        String[] reverse = builder.toString().split(" ");
        ArrayList<Integer> reverseNumberList = new ArrayList<>();
        for (String element : reverse) {
            reverseNumberList.add(Integer.parseInt(element));
        }
        return reverseNumberList;
    }
}