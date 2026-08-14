import java.util.*;

public class students {
    public static void main(String args[]) {
        ArrayList<Integer> scores = new ArrayList<>();
        // adding scores to the array list.
        scores.add(85);
        scores.add(42);
        scores.add(90);
        scores.add(65);
        scores.add(74);
        System.out.println("initial scores" + scores);
        // addition of new scores
        scores.add(95);
        scores.add(2, 88);
        // giving grace marks to student with 42 marks
        scores.set(1, 50);
        System.out.println("the new list is" + scores);
        // removing the value 65
        scores.remove(Integer.valueOf(65));
        System.out.println("the list after removal" + scores);
        if (scores.contains(Integer.valueOf(90))) {
            System.out.println("It exist at" + scores.indexOf(90));
        }
        // finding average
        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum = sum + scores.get(i);
        }
        System.out.println("the average is " + sum / scores.size());
        // finding highest
        int max = 0;
        for (int a = 0; a < scores.size(); a++) {
            if (max < scores.get(a)) {
                max = scores.get(a);
            }

        }
        System.out.println("The highest number is " + max);
        // sorting the array now
        scores.sort(null);
        System.out.println("the new array after sort is" + scores);
    }
}