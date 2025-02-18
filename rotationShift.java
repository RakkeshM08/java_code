class rotationShift  {
    public static void main(String args[]){
         int n=6;
        int r=4;
        int A[]={10,20,5,1,3,2};
       r=r%n;
       int temp[]=new int[r];
       int i;
       for(i=0;i<r;i++)
       {
           temp[i]=A[i];
       }
       for(i=0;i<r;i++)
       {
           System.out.print(temp[i]+"\t");
       }
       System.out.println();
       for(i=r;i<n;i++)
       {
           A[i-r]=A[i];
       }
       for(i=0;i<n;i++)
       {
           System.out.print(A[i]+"\t");
       }
              System.out.println();

       for(i=0;i<r;i++)
       {
           A[i+n-r]=temp[i];
       }
        for(i=0;i<n;i++)
       {
           System.out.print(A[i]+"\t");
       }
       
    }
}
/*
10	20	5	1	
3	2	5	1	3	2	
3	2	10	20	5	1	
*/
