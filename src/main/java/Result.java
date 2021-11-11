public class Result {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public long repeatedString(String s, long n) {
        // Write your code here

        long number = n/s.length();
        long rem = n%s.length();
        long answer = 0;

            for (int i = 0; i <s.length(); i++) {
                if (s.charAt(i) == 'a') ;
                answer += number;
                if (i < rem) {
                    answer++;
                }
                else {
                   return answer;
                }
            }


        return answer;
    }

}
