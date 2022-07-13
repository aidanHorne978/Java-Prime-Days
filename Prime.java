import java.lang.*;

public class Prime
{
    
    /** main class which converts args to int and checks
     * if the day in the year is prime, the month, and the day
     * in the month is prime
     * @param String[] args for stdin */
    
    public static void main(String[] args)
    {
        int months[] = new int[args.length];
        for (int i = 0; i < args.length; i++)
        {
            months[i] += Integer.parseInt(args[i]);
        }
        int daycount = 1;
        // Looping through each month
        for (int monthcount = 0; monthcount < months.length; monthcount++)
        {
            // Looping through each day in the month
            for (int day = 0; day < months[monthcount]; day++)
                {
                    // Checking if the month is prime
                    if (isPrime(monthcount + 1))
                    {
                        // Checking if the day in the year is prime
                        if(isPrime(daycount))
                            {
                                // Checking if the day in the month is prime
                                if (isPrime(day + 1))
                                    {
                                        System.out.println(daycount + ": " + (monthcount + 1) + " " + (day + 1));
                                    }
                            }
                    }
                    daycount++;
            }
        }
    }
    
    /** Checks if the input number is prime or not
     * @param num input number we are checking
     * @return either true or false
     */
    
    public static boolean isPrime(int num)
    {
        if (num <= 1)
            {
                return false;
            }
        if (num != 2)
            {
            if (num % 2 == 0)
                {
                    return false;
                }
            }
        for (int i = 3; i * i <= num; i+=2)
             {
                 if ((num % i) == 0)
                     {
                         return false;
                     }
             }
        return true;
    }
}

