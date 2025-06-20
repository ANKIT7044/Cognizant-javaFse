
package applicationpack;

public class ExcelFactory extends DocumentFactory{
    @Override
    public void createDocument(){
        System.out.println("An excel document has been created");
    }
    
}
