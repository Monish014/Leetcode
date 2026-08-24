class Solution {
    public String reverseVowels(String s) {
        int low=0;
        int high=s.length()-1;
        char[] arr=s.toCharArray();
        while(low<high){
            if((arr[low]=='a'||arr[low]=='e'||arr[low]=='i'||arr[low]=='o'||arr[low]=='u'||arr[low]=='A'||arr[low]=='E'||arr[low]=='I'||arr[low]=='O'||arr[low]=='U') && (arr[high]=='A'||arr[high]=='E'||arr[high]=='I'||arr[high]=='O'||arr[high]=='U'||arr[high]=='a'||arr[high]=='e'||arr[high]=='i'||arr[high]=='o'||arr[high]=='u')){
                char temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
            else if((arr[low]=='a'||arr[low]=='e'||arr[low]=='i'||arr[low]=='o'||arr[low]=='u'||arr[low]=='A'||arr[low]=='E'||arr[low]=='I'||arr[low]=='O'||arr[low]=='U') && (arr[high]!='A'&&arr[high]!='E'&&arr[high]!='I'&&arr[high]!='O'&&arr[high]!='U'&& arr[high]!='a'&&arr[high]!='e'&&arr[high]!='i'&&arr[high]!='o'&&arr[high]!='u')){
                high--;
            }
            else{
                low++;
            }
        }
        return String.valueOf(arr);
    }
}