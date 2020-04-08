public class sample {
    public static void main(String[] args) {
        ProductCatalog a = new ProductCatalog();
        a.addProduct(new Product(1, "belt", 5, 2.0));
        a.addProduct(new Product(1, "tie", 5, 5.0));
        a.addProduct(new Product(1, "tie", 50, 5.0));
        a.showCatalog();
        System.out.println(a.searchProduct("tie"));

        System.out.println("----------------------------");

        User c = new User("sandy");
        c.getCart().addToCart(new Product(1, "belt", 5, 2.0));
        c.getCart().addToCart(new Product(1, "tie", 50, 5.0));
        c.getCart().removeFromCart(new Product(1, "tie", 5000, 5.0));
        c.getCart().showCart();

        System.out.println("---------------------------");

        User d = new User("krish");
        d.getCart().addToCart(new Product(1, "belt shop", 5, 2.0));
        d.getCart().addToCart(new Product(1, "tie shop", 50, 5.0));
        d.getCart().removeFromCart(new Product(1, "tie", 5000, 5.0));
        d.getCart().showCart();

        int givenquantity = 2;
        if (givenquantity < a.searchProduct("belt").getQuantity()) {
            c.getCart().addToCart(new Product(1, "belt", 5, 2.0));
        } else {
            System.out.println("out of quantity");
        }
        System.out.println("---------------------------");
        c.getCart().showCart();
    }
}