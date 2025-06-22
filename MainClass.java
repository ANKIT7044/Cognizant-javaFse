
package applicationpack;


public class MainClass {

    public static double FutureVal(double P,double r,double t){
        if(t==0)return P;
        return FutureVal(P, r, t-1)*(1+r);
    }
    public static void main(String[] args) {
        double P=1000;
        double r=0.05;
        double t=3;
        
        double future_val=FutureVal(P, r, t);
        System.out.println("The Future value is : "+future_val);
    }
    
}
