
package applicationpack;


public class MainClass {

   
    public static void main(String[] args) {
        WordFactory word=new WordFactory();
        PdfFactory pdf=new PdfFactory();
        ExcelFactory excel=new ExcelFactory();
        
        word.createDocument();
        pdf.createDocument();
        excel.createDocument();
        
    }
    
}
