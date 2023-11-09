package lib;

public class solveLabThree {
    private static void printResponse(double response, int x){
        System.out.println("x = " + x +" Ответ: "+ response);
    }

    private static void printResponse(double response, double x){
        System.out.println("x = " + x +" Ответ: "+ response);
    }
    private static void outputDataTest(int n, int[] arrX){
        System.out.println("n = " + n);

        System.out.print("x: ");
        for (int x : arrX) {
            System.out.print(x + " ");
        }
    }
    private static void outputDataTest(int n, double[] arrX){
        System.out.println("n = " + n);

        System.out.print("x: ");
        for (double x : arrX) {
            System.out.print(x + " ");
        }
    }
    public static void allTest(){
        int n = 10;
        int[] dataTest = new int[]{0,1,2,3,4};
        double[] dataTest2 = new double[]{-1,-0.9,-0.5,0,0.5,0.9,1};
        double[] dataTest3 = new double[]{-0.25, -0.1, 0, 0.1,0.5};

        System.out.println("DataTest 1:");
        outputDataTest(n, dataTest);

        System.out.println("\nDataTest 2:");
        outputDataTest(n, dataTest2);

        System.out.println("\nDataTest 3:");
        outputDataTest(n, dataTest3);

        System.out.println("\n---------Задание 1---------");
        for (int i : dataTest) {
            solve_1(n, i);
        }

        System.out.println("\n---------Задание 2---------");
        for (double i : dataTest2) {
            solve_2(n, i);
        }

        System.out.println("\n---------Задание 3---------");
        for (double i : dataTest2) {
            solve_3(n, i);
        }

        System.out.println("\n---------Задание 4---------");
        for (int i : dataTest) {
            solve_4(n,i);
        }

        System.out.println("\n---------Задание 5---------");
        for (int i : dataTest) {
            solve_5(n, i);
        }

        System.out.println("\n---------Задание 6---------");
        for (int i : dataTest) {
            solve_6(n, i);
        }

        System.out.println("\n---------Задание 7---------");
        for (int i : dataTest) {
            solve_7(n, i);
        }

        System.out.println("\n---------Задание 8---------");
        for (int i : dataTest) {
            solve_8(n, i);
        }

        System.out.println("\n---------Задание 9---------");
        for (double i : dataTest2) {
            solve_9(n, i);
        }

        System.out.println("\n---------Задание 10---------");
        for (double i : dataTest2) {
            solve_10(n, i);
        }

        System.out.println("\n---------Задание 11---------");
        System.out.println("n = 2");
        for (double i : dataTest2) {
            solve_11(2, i);
        }

        System.out.println("\n---------Задание 12---------");
        for (double i : dataTest3) {
            solve_12(n, i);
        }

        System.out.println("\n---------Задание 13---------");
        for (double i : dataTest2) {
            solve_13(n, i);
        }

        System.out.println("\n---------Задание 14---------");
        for (double i : dataTest2) {
            solve_14(n, i);
        }

        System.out.println("\n---------Задание 15--------");
        for (double i : dataTest2) {
            solve_15(n, i);
        }

        System.out.println("\n---------Задание 16---------");
        for (double i : dataTest2) {
            solve_16(n, i);
        }
    }
    private static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    private static void solve_1(int n, int x){
        double S = 0;
        for (int i = 1; i <= n; i++) {
            double x1 = 2 * i * Math.pow(x,2 * i + 1);
            double x2 = getFactorial((2 * i + 1));
            double An = Math.pow(-1,i) * (x1 / x2);
            S += An;
        }

        printResponse(S,x);
    }

    private static void solve_2(int n, double x){
        if(x > -1 && x < 1){
            double S = 0;
            for (int i = 0; i <= n; i++) {
                double x1 = Math.pow(x,2 * i + 1);
                double x2  = 2 * i + 1;
                double An = x1 / x2;
                S += An;
            }

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_3(int n, double x){
        if(x > -1 && x < 1){
            double S = 0;
            for (int i = 0; i <= n; i++) {
                double x1 = Math.pow(x,4 * n + 1);
                double x2  = 4 * n + 1;
                double An = x1 / x2;
                S += An;
            }

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_4(int n, int x){
        double S = 0;
        for (int i = 0; i <= n; i++) {
            double x1 = Math.pow(2,(double) i / 2) * Math.cos(Math.PI * i / 4) * Math.pow(x,i);
            double x2 = getFactorial(i);
            double An = x1 / x2;
            S += An;
        }

        printResponse(S,x);
    }

    private static void solve_5(int n, int x){
        double S = 0;
        for (int i = 0; i <= n; i++) {
            double x1 = Math.pow(2,(double) i / 2) * Math.sin(Math.PI * i / 4) * Math.pow(x,i);
            double x2 = getFactorial(i);
            double An = x1 / x2;
            S += An;
        }

        printResponse(S,x);
    }

    private static void solve_6(int n, int x){
        double S = 0;
        for (int i = 2; i <= n; i++) {
            double x1 = Math.pow(-1,i + 1) * (i - 1) * Math.pow(x,i);
            double x2 = getFactorial(i);
            double An = x1 / x2;
            S += An;
        }

        printResponse(S,x);
    }

    private static void solve_7(int n, int x){
        double S = 0;
        for (int i = 1; i <= n; i++) {
            double x1 = 2 * i * Math.pow(x,2 * i + 1);
            double x2 = getFactorial(2 * i + 1);
            double An = Math.pow(-1,i) * (x1 / x2);
            S += An;
        }

        printResponse(S,x);
    }

    private static void solve_8(int n, int x){
        double S = 0;
        for (int i = 1; i <= n; i++) {
            double x1 = 2 * i * Math.pow(x,2 * i + 1);
            double x2 = getFactorial(2 * i + 1);
            double An = Math.pow(-1,i) * (x1 / x2);
            S += An;
        }

        printResponse(S,x);
    }

    private static void solve_9(int n, double x){
        if(x >= -1 && x < 1){
            double S = 0;
            double q = 0;
            for (int i = 1; i <= n; i++) {
                q += 1.0 / i;
                double x1 = Math.pow(x,i + 1);
                double x2 = i + 1;
                double An = q * (x1 / x2);
                S += An;
            }

            S *= 2;

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_10(int n, double x){
        if(x >= -1 && x < 1){
            double S = 0;
            double q = 0;
            for (int i = 1; i <= n; i++) {
                q += 1.0 / i;
                double An = Math.pow(-1, i - 1) * q * Math.pow(x,i);
                S += An;
            }

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_11(int n, double x){
        if(x >= -1 && x < 1){
            double S = 0;
            for (int i = 0; i <= n; i++) {
                double x1 = getFactorial(getFactorial(2 * i + 1)) * Math.pow(x, 2 * i);
                double x2 = getFactorial(getFactorial(2 * i));
                double An = x1 / x2;
                S += An;
            }

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_12(int n, double x){
        if(x > -0.25 && x <= 0.5){
            double S = Math.atan(2);
            for (int i = 1; i <= n; i++) {
                double x1 = Math.pow(-1, i) * Math.pow(2, 2 * i - 1) * Math.pow(x,2 * i - 1);
                double x2 = 2 * i -1;
                double An = x1 / x2;
                S += An;
            }

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_13(int n, double x){
        if(x >= -1 && x <= 1){
            double S = 0;
            for (int i = 1; i <= n; i++) {
                double x1 = Math.pow(x,2 * i);
                double x2 = 2 * i * (2 * i - 1);
                double An = Math.pow(-1, i + 1) * (x1 / x2);
                S += An;
            }

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_14(int n, double x){
        if(x >= -1 && x <= 1){
            double S = 0;
            for (int i = 0; i <= n; i++) {
                double x1 = Math.pow(x, 2 * i + 1) * (1 + Math.pow(x,2));
                double x2 = 2 * i + 1;
                double An = Math.pow(-1, i) * (x1 / x2);
                S += An;
            }

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_15(int n, double x){
        if(x >= -1 && x <= 1){
            double S = 0;
            for (int i = 1; i <= n; i++) {
                double x1 = Math.pow(x,i) * (1 + x);
                double An = Math.pow(-1, i - 1) * (x1 / i);
                S += An;
            }

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }

    private static void solve_16(int n, double x){
        if(x >= -1 && x <= 1){
            double S = 0;
            for (int i = 1; i <= n; i++) {
                double x1 = Math.pow(-1, i + 1) * Math.pow(x,2 * n + 1);
                double x2 = 4 * Math.pow(i,2) - 1;
                double An = (x1 / x2);
                S += An;
            }

            S = x + S * 2;

            printResponse(S,x);
        }else{
            System.out.println("x = " + x + " Некоректные данные! x должен быть -1 < x < 1");
        }
    }
}
