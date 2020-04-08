public class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double unitPrice;

    Product(int proId, String proName, int quant, double uniPr) {
        productId = proId;
        productName = proName;
        quantity = quant;
        unitPrice = uniPr;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setProductId(int pId) {
        productId = pId;
    }

    public void setProductName(String pName) {
        productName = pName;
    }

    public void setQuantity(int quan) {
        quantity = quan;
    }

    public void setUnitPrice(double unPri) {
        unitPrice = unPri;
    }

    public String toString() {
        String str = "";
        str = str + productId + " ";
        str = str + productName + " ";
        str = str + quantity + " ";
        str = str + unitPrice;
        return str;
    }

}