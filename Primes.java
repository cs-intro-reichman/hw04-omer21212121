public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[n+1];
        int p = 2;
        for (int i = 2; i<arr.length;i++){
            arr[i] = true;
        }
        while (Math.sqrt(n) >= p) {
            if (arr[p]){
                int k = p * p;
                while (k <= n){
                    arr[k] = false;
                    k += p;
                }
            } 
            p++;
        }
        int count = 0;
        int i = 2;
        while (i < arr.length){
            if (arr[i]){
                System.out.println(i);
                count++;
            }
            i++;
        }
        double precent = (count/ (double)n) * 100;

        System.out.println("There are " + count + " primes between 2 and " + n +  " (" + (int)precent + "% are primes)");


        
    }
}