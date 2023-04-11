import java.util.Arrays;

public class Matrix {
    //OgrenciNo:1030510326
    //IsimSoyisim:Batuhan Erol
    //eruvisual@gmail.com

    //matrix multiplication
    public static double[][] multiply(double[][] M, double[][] N) {
        int mRowLength = M.length;
        int nColumnLength = N[0].length;
        if (mRowLength != nColumnLength) {
            throw new RuntimeException("M's row and N's column lengths have to be equal in order to multiplication in matrices");
        }
        double[][] result = new double[mRowLength][nColumnLength];
        for (int i = 0; i < mRowLength; i++) {
            for (int j = 0; j < nColumnLength; j++) {
                for (int k = 0; k < N.length; k++) {
                    result[i][j] += M[i][k] * N[k][j];
                }
            }
        }
        return result;
    }

    //returns a new matrix that is the transpose of the matrix M
    public static double[][] transpose(double[][] M) {
        int mRowLength = M.length;
        int mColumnLength = M[0].length;
        double[][] result = new double[mColumnLength][mRowLength];
        for (int i = 0; i < mRowLength; i++) {
            for (int j = 0; j < mColumnLength; j++) {
                result[j][i] = M[i][j];
            }
        }
        return result;
    }

    //returns true if the matrix M is symmetric
    public static boolean isSymmetric(double[][] M) {
        int mRowLength = M.length;
        int mColumnLength = M[0].length;
        if (mRowLength != mColumnLength) {
            return false; // it has to be square matrix in order to be symmetric
        }
        double[][] transposedMatrix = transpose(M);
        for (int i = 0; i < mRowLength; i++) {
            for (int j = 0; j < mColumnLength; j++) {
                if (M[i][j] != transposedMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // returns string representation of the matrix M
    public static String toString(double[][] M) {
        StringBuilder builder = new StringBuilder();
        for (double[] doubles : M) {
            builder.append(Arrays.toString(doubles)).append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {    //to test Matrix class
        double[][] A = {{4.0, 3.0}, {2.0, 1.0}};
        double[][] B = {{-0.5, 1.5}, {1.0, -2.0}};
        double[][] result;

        try {
            result = Matrix.multiply(A, B);
            System.out.println(Matrix.toString(result));
        } catch (Exception e) {
            System.out.println("Try again");
        }

        double[][] C = {{2.0, -1.0, 3.0}, {-1.0, 0.0, 5.0}, {3.0, 5.0, 6.0}};
        boolean sym = Matrix.isSymmetric(C);
        System.out.println(sym); // this line is added by me

        double[][] D = {{4.0, 3.0, 2.0}, {2.0, 1.0, -2.0}};
        double[][] DT = Matrix.transpose(D);
        System.out.println(Matrix.toString(DT));
    }
}
