
package applicationpack;

public class DocumentPdf implements  PdfDocument{
    @Override
    public void PdfOp1(){
        System.out.println("This is the first operation of Pdf Document");
    };
    @Override
    public void PdfOp2(){
        System.out.println("This is the second operation of Pdf Document");

    };
    @Override
    public void PdfOp3(){
        System.out.println("This is the third operation of Pdf Document");

    };
}
