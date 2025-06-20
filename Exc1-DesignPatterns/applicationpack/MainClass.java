
package applicationpack;


public class MainClass {

    public static void main(String[] args) {
        //a and b will be refering to the same memory location
        Logger a=Logger.getInstance();
        Logger b=Logger.getInstance();
        a.display("Hi this is a");
        b.display("Hi this is b");
     }
    
}
