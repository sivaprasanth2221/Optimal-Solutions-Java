public class PrimeOrNot{
    public static void main(String[] args){
        int n=40,i,count=0;
        for(i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println("Prime");
        }
        else
            System.out.println("Not a prime");
    }
}

//Time complexity: O(√n)