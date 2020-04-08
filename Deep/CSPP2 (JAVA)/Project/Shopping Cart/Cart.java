import java.util.ArrayList;

public class Cart {
    ArrayList<Product> cartItems;

    Cart() {
        cartItems = new ArrayList<Product>();
    }

    public void addToCart(Product pro) {
        if (searchProduct(pro.getProductName()) == null)
            cartItems.add(pro);
        else {
            int oldQuantity = searchProduct(pro.getProductName()).getQuantity();
            searchProduct(pro.getProductName()).setQuantity(pro.getQuantity() + oldQuantity);
        }
    }

    public void removeFromCart(Product pro) {
        if (searchProduct(pro.getProductName()) != null) {
            for (int i = 0; i < cartItems.size(); i++) {
                if (cartItems.get(i).getProductName().equals(pro.getProductName())) {
                    cartItems.remove(i);
                }
            }
        }
    }

    public void showCart() {
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i));
        }
    }

    public Product searchProduct(String proName) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getProductName().equals(proName)) {
                return cartItems.get(i);
            }
        }
        return null;
    }
}