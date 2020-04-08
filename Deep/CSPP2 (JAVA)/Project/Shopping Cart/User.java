public class User {
    private String userName;
    private String coupon;
    private Cart cart;

    User(String name) {
        userName = name;
        cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }
}