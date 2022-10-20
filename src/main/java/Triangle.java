public class Triangle {

    static double[] borderTestCase_Avalue = {5.0, 5.0, 5.0, 5.0, 5.0, 0, 10.0, 0.0, 10.0, -0.1, 5.0};
    static double[] borderTestCase_Bvalue = {5.0, 5.0, 5.0, 0.0, 10.0, 5, 5.0, 0.0, 10.0, 5.0, 0.0,};
    static double[] borderTestCase_Cvalue = {5.0, 10.0, 0.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 10.0, 10.1};
    
    static double[][] aValue = {
            {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 2.3, 2.3, 2.3, 2.3, 2.3, 2.3, 2.3, 2.3, 2.3},
            {4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 4.0, 5.3, 5.3, 5.3, 5.3, 5.3, 5.3, 5.3, 5.3, 5.3,},
            {5.5, 5.5, 5.5, 5.5, 5.5, 5.5, 5.5, 5.5, 5.5, 6.1, 6.1, 6.1, 6.1, 6.1, 6.1, 6.1, 6.1, 6.1},
            {7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 7.0, 8.3, 8.3, 8.3, 8.3, 8.3, 8.3, 8.3, 8.3, 8.3},
            {8.5, 8.5, 8.5, 8.5, 8.5, 8.5, 8.5, 8.5, 8.5, 9.3, 9.3, 9.3, 9.3, 9.3, 9.3, 9.3, 9.3, 9.3}
    };

    static double[][] bValue = {
            {2.0, 2.0, 2.0, 0.0, 0.0, 0.0, 3.8, 3.8, 3.8, 2.0, 2.0, 2.0, 0.0, 0.0, 0.0, 3.8, 3.8, 3.8},
            {4.0, 4.0, 4.0, 5.4, 5.4, 5.4, 4.9, 4.9, 4.9, 4.0, 4.0, 4.0, 5.4, 5.4, 5.4, 4.9, 4.9, 4.9,},
            {5.5, 5.5, 5.5, 6.7, 6.7, 6.7, 5.9, 5.9, 5.9, 5.5, 5.5, 5.5, 6.7, 6.7, 6.7, 5.9, 5.9, 5.9},
            {7.0, 7.0, 7.0, 8.4, 8.4, 8.4, 7.9, 7.9, 7.9, 7.0, 7.0, 7.0, 8.4, 8.4, 8.4, 7.9, 7.9, 7.9,},
            {8.5, 8.5, 8.5, 8.9, 8.9, 8.9, 10.0, 10.0, 10.0, 8.5, 8.5, 8.5, 8.9, 8.9, 8.9, 10.0, 10.0, 10.0}
    };

    static double[][] cValue = {
            {1.5, 2.6, 0.1, 1.5, 2.6, 0.1, 1.5, 2.6, 0.1, 1.5, 2.6, 0.1, 1.5, 2.6, 0.1, 1.5, 2.6, 0.1},
            {4.0, 5.4, 4.3, 4.0, 5.4, 4.3, 4.0, 5.4, 4.3, 4.0, 5.4, 4.3, 4.0, 5.4, 4.3, 4.0, 5.4, 4.3},
            {5.5, 6.9, 6.3, 5.5, 6.9, 6.3, 5.5, 6.9, 6.3, 5.5, 6.9, 6.3, 5.5, 6.9, 6.3, 5.5, 6.9, 6.3},
            {7.0, 8.3, 7.2, 7.0, 8.3, 7.2, 7.0, 8.3, 7.2, 7.0, 8.3, 7.2, 7.0, 8.3, 7.2, 7.0, 8.3, 7.2},
            {8.5, 9.9, 8.8, 8.5, 9.9, 8.8, 8.5, 9.9, 8.8, 8.5, 9.9, 8.8, 8.5, 9.9, 8.8, 8.5, 9.9, 8.8,}
    };
    public static String calculatePoint(double a, double b, double c) {
        String result = "";
        try {
            if (a < 0.0 || a > 10.0 || b < 0.0 || b > 10.0 || c < 0.0 || c > 10.0) {
                result = "Không hợp lệ";
            }

            double T = a * 0.1 + b * 0.3 + c * 0.6;

            if (0.0 <= T && T < 4.0) {
                result = "F";
            }

            if (4.0 <= T && T <= 5.4) {
                result = "D";
            }

            if (5.5 <= T && T <= 6.9) {
                result = "C";
            }

            if (7.0 <= T && T <= 8.4) {
                result = "B";
            }

            if (8.5 <= T && T <= 10.0) {
                result = "A";
            }
        } catch (Exception e) {
            return "Không hợp lệ";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Kiểm thử biên");
        for (int i = 0; i < 11; i++) {
            System.out.println(i + 1 + " " + calculatePoint( borderTestCase_Avalue[i], borderTestCase_Bvalue[i], borderTestCase_Cvalue[i]));
        }

        System.out.println("Kiểm thử tương đương Phân hoạch 0.0 <= T < 4.0");
        for (int i = 0; i < 18; i++) {
            System.out.println(i + 1 + " " + calculatePoint( aValue[0][i], bValue[0][i], cValue[0][i]));
        }

        System.out.println("Kiểm thử tương đương Phân hoạch 4.0 <= T <= 5.4");
        for (int i = 0; i < 18; i++) {
            System.out.println(i + 1 + " " + calculatePoint( aValue[1][i], bValue[1][i], cValue[1][i]));
        }

        System.out.println("Kiểm thử tương đương Phân hoạch 5.5 <=  T <= 6.9");
        for (int i = 0; i < 18; i++) {
            System.out.println(i + 1 + " " + calculatePoint( aValue[2][i], bValue[2][i], cValue[2][i]));
        }

        System.out.println("Kiểm thử tương đương Phân hoạch 7.0 <= T <= 8.4");
        for (int i = 0; i < 18; i++) {
            System.out.println(i + 1 + " " + calculatePoint( aValue[3][i], bValue[3][i], cValue[3][i]));
        }

        System.out.println("Kiểm thử tương đương Phân hoạch 8.5 <= T <= 10.0");
        for (int i = 0; i < 18; i++) {
            System.out.println(i + 1 + " " + calculatePoint( aValue[4][i], bValue[4][i], cValue[4][i]));
        }
    }
}