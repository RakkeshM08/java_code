class Occurance
{
    public static void main(String args[])
    {
            int arr[]={3,2,3,1,2,9};
            int n = arr.length;
            int count=0;
            int j;
            for(int i=0;i<n;i++)
            {
                count=1;
                for(j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                        arr[j]=-1;
                    }
                }
                if(arr[i]!=-1)
                {
                    System.out.println("the number "+arr[i]+" present "+count+" times");
                }
            }
           
    }
}


      

