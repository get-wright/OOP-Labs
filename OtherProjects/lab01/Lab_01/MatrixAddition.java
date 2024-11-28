import java.util.Scanner;

class Matrix {
    private int[][] data;
    private int size;
    public Matrix(int size) {
        this.size = size;
        data = new int[size][size];
    }
    public void inputElements(Scanner scanner) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }
    public Matrix add(Matrix other) {
        Matrix result = new Matrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }
    public void display() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int size = scanner.nextInt();
        Matrix matrix1 = new Matrix(size);
        Matrix matrix2 = new Matrix(size);
        System.out.println("Enter elements of first matrix:");
        matrix1.inputElements(scanner);
        System.out.println("Enter elements of second matrix:");
        matrix2.inputElements(scanner);
        Matrix sumMatrix = matrix1.add(matrix2);
        System.out.println("Sum of the matrices:");
        sumMatrix.display();
        scanner.close();
    }
}
