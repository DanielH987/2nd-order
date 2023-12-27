import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            // Read input values
            String[] s1Parts = scanner.nextLine().split(" ");
            String[] s2Parts = scanner.nextLine().split(" ");
            String[] c1Parts = scanner.nextLine().split(" ");
            String[] c2Parts = scanner.nextLine().split(" ");

            int s1 = Integer.parseInt(s1Parts[1]);
            int s2 = Integer.parseInt(s2Parts[1]);
            int c1 = Integer.parseInt(c1Parts[1]);
            int c2 = Integer.parseInt(c2Parts[1]);

            // Calculate r1 and r2
            double discriminant = Math.sqrt(c1 * c1 + 4 * c2);
            double r1 = (c1 + discriminant) / 2;
            double r2 = (c1 - discriminant) / 2;

            // Calculate p and q
            double p, q;
            if (r1 == r2) {
                double r = r1;
                p = s1;
                q = (s2 - p * r) / r;
            } else {
                p = (s2 - s1 * r2) / (r1 - r2);
                q = s1 - p;
            }

            // Print the values of p, q, r1, r2
            System.out.println("r1 = " + r1);
            System.out.println("r2 = " + r2);
            System.out.println("p = " + p);
            System.out.println("q = " + q);

            // Construct and print the formula for S(n)
            String formula;
            if (r1 == r2) {
                formula = "S(n) = (" + p + ")(" + r1 + ")^(n-1) + (" + q + ")(n-1)(" + r1 + ")^(n-1)";
                System.out.println(formula);
                // Calculate and print values for n = 1 to 10
                for (int n = 1; n <= 10; n++) {
                    double sn = p * Math.pow(r1, n - 1) + q * (n - 1) * Math.pow(r2, n - 1);
                    System.out.println("S(" + n + ") = " + sn);
                }
            } else {
                formula = "S(n) = (" + p + ")(" + r1 + ")^(n-1) + (" + q + ")(" + r2 + ")^(n-1)";
                System.out.println(formula);
                // Calculate and print values for n = 1 to 10
                for (int n = 1; n <= 10; n++) {
                    double sn = p * Math.pow(r1, n - 1) + q * Math.pow(r2, n - 1);
                    System.out.println("S(" + n + ") = " + sn);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
