
package applicationpack;public class Product {
    private int productId;
    private String productName;
    private String cataegory;
    public Product(){
        this.productId=0;
        this.productName="";
        this.cataegory="";
    }
    public Product(int id,String name,String cat){
        this.productId=id;
        this.productName=name;
        this.cataegory=cat;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCataegory() {
        return cataegory;
    }

    public void setCataegory(String cataegory) {
        this.cataegory = cataegory;
    }
    
}
