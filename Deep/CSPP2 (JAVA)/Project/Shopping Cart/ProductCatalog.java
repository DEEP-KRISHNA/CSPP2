import java.util.ArrayList;

public class ProductCatalog {
    ArrayList<Product> products;

    ProductCatalog() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product pro) {
        if (searchProduct(pro.getProductName()) == null)
            products.add(pro);
        else {
            int oldQuantity = searchProduct(pro.getProductName()).getQuantity();
            searchProduct(pro.getProductName()).setQuantity(pro.getQuantity() + oldQuantity);
        }
    }

    public void showCatalog() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public Product searchProduct(String proName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductName().equals(proName)) {
                return products.get(i);
            }
        }
        return null;
    }
}