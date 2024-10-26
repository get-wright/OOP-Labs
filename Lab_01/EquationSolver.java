import java.util.Scanner;

public class EquationSolver {
    public void solve_First_Degree(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinitely many solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("The solution is: x = " + x);
        }
    }
    public void solveSystemOfFirstDegree(double a11, double a12, double b1, double a21, double a22, double b2) {
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("Infinitely many solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The solution is: x1 = " + x1 + ", x2 = " + x2);
        }
    }
    public void solveSecondDegree(double a, double b, double c) {
        if (a == 0) {
            // This becomes a first-degree equation
            solve_First_Degree(b, c);
        } else {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("No real solutions.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has a double root: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The solutions are: x1 = " + x1 + ", x2 = " + x2);
            }
        }
    }
    public void Solver() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of equation: ");
        System.out.println("1 - First-degree equation");
        System.out.println("2 - System of first-degree equations with two variables");
        System.out.println("3 - Second-degree equation with one variable");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Solving ax + b = 0");
                System.out.print("Enter the coefficient a: ");
                double a1 = scanner.nextDouble();
                System.out.print("Enter the coefficient b: ");
                double b1 = scanner.nextDouble();
                solve_First_Degree(a1, b1);
                break;

            case 2:
                System.out.println("Solving system of equations:");
                // Equation 1: a11*x1 + a12*x2 = b1
                System.out.print("Enter the coefficient a11: ");
                double a11 = scanner.nextDouble();
                System.out.print("Enter the coefficient a12: ");
                double a12 = scanner.nextDouble();
                System.out.print("Enter the constant b1: ");
                double constantB1 = scanner.nextDouble();
                // Equation 2: a21*x1 + a22*x2 = b2
                System.out.print("Enter the coefficient a21: ");
                double a21 = scanner.nextDouble();
                System.out.print("Enter the coefficient a22: ");
                double a22 = scanner.nextDouble();
                System.out.print("Enter the constant b2: ");
                double constantB2 = scanner.nextDouble();
                solveSystemOfFirstDegree(a11, a12, constantB1, a21, a22, constantB2);
                break;

            case 3:
                System.out.println("Solving ax^2 + bx + c = 0");
                System.out.print("Enter the coefficient a: ");
                double a2 = scanner.nextDouble();
                System.out.print("Enter the coefficient b: ");
                double b2 = scanner.nextDouble();
                System.out.print("Enter the constant c: ");
                double c2 = scanner.nextDouble();
                solveSecondDegree(a2, b2, c2);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                break;
        }

        scanner.close();
    }
    public static void main(String[] args) {
        EquationSolver solver = new EquationSolver();
        solver.Solver();
    }
}