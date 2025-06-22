
package applicationpack;

import java.util.Scanner;



public class MainClass {

    public String EnterItem(){
        Scanner sc=new Scanner(System.in);
        String name="";
        System.out.println("Enter your item:    ");
        name=sc.nextLine();
        return name;
}
    public void LinearSearch(String itemName,Product[] products){
        boolean b=false;
        
        for(Product p:products){
            if(p.getProductName().equalsIgnoreCase(itemName)){
                System.out.println("Product Id: "+p.getProductId());
                System.out.println("Product Name: "+p.getProductName());
                System.out.println("Cataegory: "+p.getCataegory());
                b=true;
                break;
            }
            
        }
        if(b==false)System.out.println("Product not found...");
    }
    
    public void sort(Product[] products) {
            for(int i=0;i<products.length-1;i++){
                for(int j=0;j<products.length-i-1;j++){
                    if(products[j].getProductName().compareToIgnoreCase(products[j+1].getProductName())>0){
                        Product temp=products[j];
                        products[j]=products[j+1];
                        products[j+1]=temp;
                    }
                }
            }
        
    }
    
    
    public void BinarySearch(String itemName,Product[] products,int s,int e){
        if(s>e){
            System.out.println("Item not found...");
            return;
        }
        
        int mid=s+(e-s)/2;
        if(itemName.equalsIgnoreCase(products[mid].getProductName())){
            System.out.println("Product Id: "+products[mid].getProductId());
            System.out.println("Product Name: "+products[mid].getProductName());
            System.out.println("Cataegory: "+products[mid].getCataegory());
        }
        else if(itemName.compareToIgnoreCase(products[mid].getProductName())<0)BinarySearch(itemName, products,s,mid-1);
        else BinarySearch(itemName, products,mid+1,e);
            
        }
    
    public static void main(String[] args) {
        Product[] products=new Product[5];
        Product p1=new Product();
        p1.setProductId(1);
        p1.setProductName("laptop");
        p1.setCataegory("Electronic Device");
        
        Product p2=new Product();
        p2.setProductId(2);
        p2.setProductName("Cricket Bat");
        p2.setCataegory("Sports item");
        
        Product p3=new Product();
        p3.setProductId(3);
        p3.setProductName("Biscuit");
        p3.setCataegory("Groccery item");
        
        Product p4=new Product();
        p4.setProductId(4);
        p4.setProductName("Cake");
        p4.setCataegory("Groccery item");
        
        Product p5=new Product();
        p5.setProductId(5);
        p5.setProductName("Smart phone");
        p5.setCataegory("Electronic device");
        
        products[0]=p1;
        products[1]=p2;
        products[2]=p3;
        products[3]=p4;
        products[4]=p5;
        
        MainClass m=new MainClass();
        String itemName=m.EnterItem();
        
       System.out.println("-----Linear Search------"); 
       m.LinearSearch(itemName,products);
       m.sort(products);
       System.out.println("-----Binary Search------");
       m.BinarySearch(itemName,products,0,products.length-1);
        
        
        
    }
    
}

