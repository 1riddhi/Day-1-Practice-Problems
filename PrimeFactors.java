import java.util.ArrayList;
public class PrimeFactors{
    public static void main(String []args){

        if(args.length==0){
            System.out.println("Enter 1 command line argument(N)");
            return;
        }
        int n=Integer.parseInt(args[0]),num;
        num=n;
        
        ArrayList<Integer> factors= new ArrayList<>();
        for(int i=2;i*i<=n;i++){

              while(n%i==0 && n>1){
                 factors.add(i);  
                 n/=i;
              }
                  
             
        }
        if(n>1) factors.add(n);

        for(int i=0;i<factors.size()-1;i++){
            System.out.print(factors.get(i)+" x ");
        }
        System.out.println(factors.get(factors.size()-1)+" = "+num);
    }
}