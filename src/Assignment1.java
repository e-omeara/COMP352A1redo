public class Assignment1 {

    public static void main(String[] args) {

        long startTime;
        long endTime;
        long exponTime;
        long fastTime;
        int val = 0;
        int[] input = new int[26];
        int[] fast = new int[26];
        long[] ftime = new long[26];
        long[] etime = new long[26];
        int[] exp = new int[26];

        // I need to run the function once before counting the time or else it affects the results of the first run
        Question1.exponentialOdd(5);
        Question1.fastRecursion(5);

        //running through loops with oddonacci calls of different n values
        for(int i = 5; i <= 30; i++) {

            input[i-5] = i;


            //timing the exponential oddonacci sequence
            startTime = System.nanoTime();
            val = Question1.exponentialOdd(i);
            //System.out.println(Question1.exponentialOdd(i));
            endTime = System.nanoTime();
            etime[i-5] = endTime - startTime;
            exp[i-5] = val;

            //timing the linear oddonacci sequence
            startTime = System.nanoTime();
            val = Question1.fastRecursion(i);
            //System.out.println(Question1.fastRecursion(i));
            endTime = System.nanoTime();
            ftime[i-5] = endTime - startTime;
            fast[i-5] = val;

            //outputting the information for each oddonacci value
            System.out.println("Oddonacci up to: " + i);
            System.out.println("exponential time: " + etime[i-5]);
            System.out.println("fast time: " + ftime[i-5]);
            System.out.println("");


        }

        Outputer.dataToCSV(input, exp, etime, "n", "Odd(n)", "time (ns)", "exponential");
        Outputer.dataToCSV(input, fast, ftime, "n", "Odd(n)", "time (ns)", "linear");

    }
}
