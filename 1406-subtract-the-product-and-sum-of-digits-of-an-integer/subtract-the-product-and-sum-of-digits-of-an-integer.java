class Solution {
    public int subtractProductAndSum(int n) {
        int sum1 = 0;
        int sum2 = 1;
        while(n > 0){
            int res =  n % 10;
            sum1 += res;
            sum2 *=res;
            n /= 10;
        }
        return sum2 - sum1;
         
    }
}