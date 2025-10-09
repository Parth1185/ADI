//a is number of chocolates , b is number of students and c is the starting position
// find the position of the last chocolate and print the number of chocolate given to each student
public class chocolate {
    public static int findLastChocolate(int a, int b, int c) {
        int lastPos = (a + c - 1) % b;
        if (lastPos == 0)
            lastPos = b;
        return lastPos;
    }

    public static void main(String[] args) {
        int a = 8; // number of chocolates
        int b = 5;  // number of students
        int c = 2;  // starting position

        int[] chocolates = new int[b];
        int current = c;

        // Distribute chocolates
        for (int i = 1; i <= a; i++) {
            chocolates[current - 1]++;
            current++;
            if (current > b)
                current = 1;
        }

        int lastPos = findLastChocolate(a, b, c);

        System.out.println("Last chocolate goes to student: " + lastPos);
        System.out.println("Chocolates given to each student:");
        for (int i = 0; i < b; i++) {
            System.out.println("Student " + (i + 1) + ": " + chocolates[i]);
        }
    }
}
