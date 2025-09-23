
//In this program we have discussed the conditional statements in java, like selection statements and iterative statements
public class ConditionalExamples {

        public static void main(String[] args) {

            // 1. SELECTION STATEMENT: if-else
            int number = 10;
            if (number > 0) {
                System.out.println("The number is positive.");
            } else {
                System.out.println("The number is not positive.");
            }

            // 2. SELECTION STATEMENT: switch
            int day = 3;
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                default:
                    System.out.println("Another day");
            }

            // 3. ITERATIVE STATEMENT: for loop
            System.out.println("Counting from 1 to 5 using for loop:");
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }

            // 4. ITERATIVE STATEMENT: while loop
            System.out.println("Counting from 1 to 3 using while loop:");
            int j = 1;
            while (j <= 3) {
                System.out.println(j);
                j++;
            }

            // 5. ITERATIVE STATEMENT: do-while loop
            System.out.println("Counting from 1 to 2 using do-while loop:");
            int k = 1;
            do {
                System.out.println(k);
                k++;
            } while (k <= 2);
        }
    }


