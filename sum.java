public class sum {
    public static void main(String[] args) {
        //System.out.println(sumWithIteration(5)); 
        //System.out.println(sumWithRecursion(2)); 
        printFibonacciWithIteration(10);
    }

    private static Integer sumWithRecursion(int n) {
        if (n == 1)
            return 1; 
        
        int sum =  n + sumWithRecursion(n - 1);  
        System.out.println(sum); 
        return sum;
    }

    private static Integer sumWithIteration(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static void printFibonacciWithIteration(int n) {
        int[] n1 = new int[n];
        if(n > 0 ) {
            for(int i = 0; i < n; i++) {
                if(i <= 1) 
                    n1[i] = i;
                else 
                    n1[i] = n1[i-1] + n1[i-2];
                    System.out.println(n1[i]);
            }
        }
    }

    
}
