package fit.hutech.tranhuynhhainam.service;

import java.util.Collection;

import fit.hutech.tranhuynhhainam.model.CartItem;

public interface ShoppingCartService {
	void add(CartItem newItem);
	void remove(int id);
	CartItem update(int productID,int quantity);
	void clear();
	double getAmount();
	int getCount();
	Collection<CartItem> getAllItems();
}
