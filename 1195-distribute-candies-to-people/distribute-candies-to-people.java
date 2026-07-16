class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr=new int[num_people];
        int a=1;
        while(candies>0){
        for(int i=0;i<num_people;i++){
            if(candies==0){
                break;
            }
            else if(candies>=a){
                arr[i]+=a;
                candies-=a;
                a++;
            }
            else{
                arr[i]+=candies;
                candies=0;
                a++;
            }
        }
        }
        return arr;
    }
}