class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
         Arrays.sort(arr);
         
         
         int candidate = arr[n/2];
         int count = 0;
         for(int num: arr){
            if(num==candidate){
                count++;
            }
         }
         if(count>n/2){
             return candidate;
         }
         return -1;
    }
}