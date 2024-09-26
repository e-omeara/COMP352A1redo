public class Question1 {


    public static int fastRecursion(int n){

        //starting the function in the first loop
        if(n <=3){
            //it is the initial value
            return 1;
        }

        //the initial calculation is the 4th one, with previous values 3, 1, 1
        return fastRecursion(n, 4, 3, 1, 1);

    }

    public static int fastRecursion(int n, int count, int current, int minusOne, int minusTwo){

        if(count == n){
            //this is the final call / base case
            return current;
        }

        //call the method again, sending the new values / shifting the values by 1
        return fastRecursion(n, count + 1, current + minusOne + minusTwo, current, minusOne);
    }




    public static int exponentialOdd(int n){

        if(n <= 3){
            // base case
            return 1;
        }

        //call the oddonacci an additional three times
        return exponentialOdd(n-1) + exponentialOdd(n-2) + exponentialOdd(n-3);


    }

}
