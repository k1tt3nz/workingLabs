package lib;

public class solveLabTwo {
    // Вывод ответа y при входном x
    private static void printResponse(double response, int x){
        System.out.println("x = " + x +" Ответ: "+ response);
    }
    private static void outputDataTest(int a, int b, int[] arrX){
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.print("x: ");
        for (int x : arrX) {
            System.out.print(x + " ");
        }
    }
    public static void allTestSolve(){
        int a = 5;
        int b = 3;
        int[] dataTest = new int[]{-5,-4,-3,-2,-1,0,1,2,3,4};

        outputDataTest(a,b,dataTest);

        System.out.println("\n---------Задание 1---------");
        for (int i : dataTest) {
            solve_1(a, b, i);
        }

        System.out.println("\n---------Задание 2---------");
        for (int i : dataTest) {
            solve_2(a, b, i);
        }

        System.out.println("\n---------Задание 3---------");
        for (int i : dataTest) {
            solve_3(a, b, i);
        }

        System.out.println("\n---------Задание 4---------");
        for (int i : dataTest) {
            solve_4(a, b, i);
        }

        System.out.println("\n---------Задание 5---------");
        for (int i : dataTest) {
            solve_5(a, b, i);
        }

        System.out.println("\n---------Задание 6---------");
        for (int i : dataTest) {
            solve_6(a, b, i);
        }

        System.out.println("\n---------Задание 7---------");
        for (int i : dataTest) {
            solve_7(a, b, i);
        }

        System.out.println("\n---------Задание 8---------");
        for (int i : dataTest) {
            solve_8(a, b, i);
        }

        System.out.println("\n---------Задание 9---------");
        for (int i : dataTest) {
            solve_9(a, b, i);
        }

        System.out.println("\n---------Задание 10---------");
        for (int i : dataTest) {
            solve_10(a, b, i);
        }

        System.out.println("\n---------Задание 11---------");
        for (int i : dataTest) {
            solve_11(a, b, i);
        }

        System.out.println("\n---------Задание 12---------");
        for (int i : dataTest) {
            solve_12(a, b, i);
        }

        System.out.println("\n---------Задание 13---------");
        for (int i : dataTest) {
            solve_13(a, b, i);
        }

        System.out.println("\n---------Задание 14---------");
        for (int i : dataTest) {
            solve_14(a, b, i);
        }

        System.out.println("\n---------Задание 15---------");
        for (int i : dataTest) {
            solve_15(a, b, i);
        }

        System.out.println("\n---------Задание 16---------");
        for (int i : dataTest) {
            solve_16(a, b, i);
        }
    }

    private static void solve_1(int a, int b, int x){
        double y;
        if(x <= 3){
            y = b + 2 * Math.log10(Math.abs(x));
        }else{
            y =  1.0 + a;
        }

        printResponse(y,x);
    }

    private static void solve_2(int a, int b, int x){
        double y;
        if(x > 0){
            y = a + 0.5 * Math.pow(Math.E, x);
        }else{
            y =  Math.cos(b*x + 1);
        }

        printResponse(y,x);
    }

    private static void solve_3(int a, int b, int x){
        double y;
        if(x <= 0){
            y = 1 / (Math.pow(a,2) + Math.pow(x,2));
        }else{
            y =  b * Math.log10(Math.abs(x));
        }

        printResponse(y,x);
    }

    private static void solve_4(int a, int b, int x){
        double y;
        if(x <= 2){
            y = (a + Math.pow(x,2)) / b + Math.log10(Math.abs(x) + 1);
        }else{
            y =  Math.pow(Math.E,x) + Math.pow(x,x);
        }

        printResponse(y,x);
    }

    private static void solve_5(int a, int b, int x){
        double y;
        if(x <= 1){
            y = a * Math.pow(Math.sin(x),2) + Math.sqrt(x);
        }else{
            y =  b * Math.pow(Math.E,Math.pow(x,2));
        }

        printResponse(y,x);
    }

    private static void solve_6(int a, int b, int x){
        double y;
        if(x <= 1){
            y = a * Math.tan(Math.pow(x,2));
        }else{
            y =  b + (Math.pow(x,2) / (Math.pow(x,2) + a));
        }

        printResponse(y,x);
    }

    private static void solve_7(int a, int b, int x){
        double y;
        if(x > 3){
            y = (a + x) * Math.atan(a * x);
        }else{
            y =  Math.pow(Math.cos(b + Math.pow(x,3)),2);
        }

        printResponse(y,x);
    }

    private static void solve_8(int a, int b, int x){
        double y;
        if(x < 5){
            y = Math.pow(Math.sin(a + x),3);
        }else{
            y =  Math.log10(Math.sqrt(Math.abs(b - x)));
        }

        printResponse(y,x);
    }

    private static void solve_9(int a, int b, int x){
        double y;
        if(x >= 2){
            y = Math.sqrt(1 + x * Math.sqrt(a * x));
        }else{
            y =  a * Math.sin(b * x) + 3;
        }

        printResponse(y,x);
    }

    private static void solve_10(int a, int b, int x){
        double y;
        if(x >= 0){
            y = Math.sqrt(Math.pow(Math.E, 2  * x - b)) - 1;
        }else{
            y =  1 / (Math.pow(x,2) + a);
        }

        printResponse(y,x);
    }

    private static void solve_11(int a, int b, int x){
        double y;
        if(x > 4){
            y = Math.sqrt(a + Math.abs(Math.sin(x)));
        }else{
            y =  Math.tan(b * x);
        }

        printResponse(y,x);
    }

    private static void solve_12(int a, int b, int x){
        double y;
        if(x <= 1){
            y = 2 * Math.pow(x,2) + a * Math.cos(b * x);
        }else{
            y =  Math.pow(Math.E,x) + Math.tan(Math.pow(x,3));
        }

        printResponse(y,x);
    }

    private static void solve_13(int a, int b, int x){
        double y;
        if(x >= 2){
            y = Math.log10(a + Math.pow(x,2));
        }else{
            y = Math.pow(Math.E,Math.sin(x)) + 2 * b;
        }

        printResponse(y,x);
    }

    private static void solve_14(int a, int b, int x){
        double y;
        if(x > -1){
            y = 0.2 * Math.pow(x,3) + a;
        }else{
            y =  b * Math.pow(x,2) + Math.log10(Math.abs(x + 3));
        }

        printResponse(y,x);
    }

    private static void solve_15(int a, int b, int x){
        double y;
        if(x < 2){
            y = Math.sin(x + Math.pow(a,2));
        }else{
            y =  Math.log10(Math.pow(x,2) + 2 * x + b);
        }

        printResponse(y,x);
    }

    private static void solve_16(int a, int b, int x){
        double y;
        if(x < 2){
            y = Math.cos(x + Math.pow(a,2));
        }else{
            y =  Math.log10(Math.pow(x,2) + 2 * x + b);
        }

        printResponse(y,x);
    }
}