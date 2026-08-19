class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int n) {
        int temp=n;
        int sum=0;
        while(temp>0){
            sum=sum+temp%10;
            temp=temp/10;
        }
        if (n%sum==0){
            return sum;
        }
        return -1;
    }
}