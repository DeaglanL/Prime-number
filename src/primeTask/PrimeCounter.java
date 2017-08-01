package primeTask;

public class PrimeCounter {

    int start;
    int end;
    int counter;

    public PrimeCounter(int start, int end)
    {
        this.start = start;
        this.end = end;

        for (int i = start; i <= end; i++ )
        {
            if(primeCheck(i))
            {
               counter++;
            }
        }

        System.out.println("The number of primes between " + start + " and " + end + " is " + counter);
    }


    private  boolean primeCheck(int n)
    {
        if (n%2 == 0)
        {
            return  false;
        }

        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
