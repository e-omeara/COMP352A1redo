public class Question1 {


    public static int fastRecursion(int n){

        if(n <=3){
            return 1;
        }

        return fastRecursion(n, 4, 3, 1, 1);

    }

    public static int fastRecursion(int n, int count, int current, int minusOne, int minusTwo){

        if(count == n){
            return current;
        }

        return fastRecursion(n, count + 1, current + minusOne + minusTwo, current, minusOne);
    }


    public static int LinearOdd(int n){

        int first = 1;
        int second = 1;
        int third = 1;
        int current = 1;
        int oldcurrent;


        if(n <= 3){
            return 1;
        }

        for(int i = 3; i < n; i++){

            oldcurrent = current;
            current = first + second + third;
            System.out.println(" current: " + current + " first: " + first + " second: " + second + " third: " + third);
            first = second;
            second = oldcurrent;
            third = current;




        }

        return current;


    }

    public static int exponentialOdd(int n){

        if(n <= 3){
            return 1;
        }

        return exponentialOdd(n-1) + exponentialOdd(n-2) + exponentialOdd(n-3);


    }

}
