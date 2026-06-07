class Solution {
    public double average(int[] salary) {
        int maxsalary = Integer.MIN_VALUE;
        int minsalary = Integer.MAX_VALUE;
        int total = 0 ;
        for(int i = 0 ; i<salary.length ; i++)
        {
            if(maxsalary<salary[i])
            {
                maxsalary = salary[i];
            }
            if(minsalary>salary[i])
            {
                minsalary = salary[i];
            }
            total = salary[i] + total;
        }
        total = total - (maxsalary+minsalary);
        return  (double)total/(salary.length-2);
    }
}