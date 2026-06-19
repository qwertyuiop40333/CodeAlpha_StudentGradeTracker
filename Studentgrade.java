import java.util.*;

class Studentgrade {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students");
        int n = sc.nextInt();
        sc.nextLine();
        int marr[] = new int[n];
        String name[] = new String[n];
        System.out.println("Enter name and marks respectively ");
        for (int i = 0; i < n; i++) {
            name[i] = sc.nextLine();
            marr[i] = sc.nextInt();
            sc.nextLine();
        }
        int avg = 0;
        int sum = 0;
        int max = marr[0];
        int min = max;

        for (int i = 0; i < n; i++) {
            sum = sum + marr[i];
            if (max < marr[i]) {
                max = marr[i];
            }
            if (min > marr[i])
                min = marr[i];

        }
        avg = (int) sum / n;
        System.out.println("Higest is : " + max + " , lowest is : " + min + " , average is : " + avg);
    }
}