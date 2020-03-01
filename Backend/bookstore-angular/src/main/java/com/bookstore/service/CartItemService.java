package com.bookstore.service;

import com.bookstore.domain.Book;
import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;
import com.bookstore.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CartItemService {

    CartItem addBookToCartItem(Book book, User user, int qty);

    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    //	List<CartItem> findByOrder(Order order);

    CartItem updateCartItem(CartItem cartItem);

    @Transactional
    void removeCartItem(CartItem cartItem);

    CartItem findById(Long id);

    CartItem save(CartItem cartItem);

}
