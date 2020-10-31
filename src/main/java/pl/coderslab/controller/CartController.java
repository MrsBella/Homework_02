package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.domain.Cart;
import pl.coderslab.domain.CartItem;
import pl.coderslab.domain.Product;

import java.text.DecimalFormat;
import java.util.List;

@Controller
public class CartController {

    private Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @GetMapping("/addtocart")
    public String add(){
        return "form";
    }

    @PostMapping("/cart")
    public String displayCart() {
        return "displayCart";
    }

//    @GetMapping("/cart")
//    @ResponseBody
//    public String displayCart() {
//        DecimalFormat df = new DecimalFormat("0.00");
//        List<CartItem> cartItems = cart.getCartItems();
//        int items = 0;
//        int sumQuantity = 0;
//        double sum = 0;
//        for (CartItem cartItem : cartItems) {
//            sumQuantity += cartItem.getQuantity();
//            items++;
//            sum += cartItem.getProduct().getPrice() * cartItem.getQuantity();
//        }
//
//        return "W koszyku jest " + items + " pozycji. \n"
//                + "W koszysku jest " + sumQuantity + " produktów. \n"
//                + "Wartość koszyka to: " + df.format(sum);
//    }
}
