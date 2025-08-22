class Implementation_of_sliding_window{
    public static void main(String[]args){
        int arr[]={2,3,4,5,6}; //Example
        int l=0;
        int temp=0;
        int k=3;
       int max=0;
        for(int r=0;r<arr.length;r++){
            
            temp+=arr[r];
        
        if(r-l==k){
            temp-=arr[l];
            l++;
        }
        if(r-l+1==k){
            max=Math.max(temp,max);
            
        }
        }
        System.out.println(max);
    }
}
