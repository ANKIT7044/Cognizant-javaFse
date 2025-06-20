
package applicationpack;

public class PdfFactory extends DocumentFactory{
    @Override
    public void createDocument(){
        System.out.println("A pdf document has been created");
    }
}
