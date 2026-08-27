class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> arr=new ArrayList<>();
        int indexsum=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    int sum=i+j;
                    if (sum < indexsum) {
                        indexsum = sum;
                        arr.clear();
                        arr.add(list1[i]);
                    }
                    else if (sum == indexsum) {
                        arr.add(list1[i]);
                    }
                    
                    break;
                }
            }
        }
        return arr.toArray(new String[0]);
    }
}