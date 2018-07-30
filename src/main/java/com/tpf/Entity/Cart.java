package com.tpf.Entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Cart {

	private HashMap<Good, Integer> goods;
	private Double totalPrice;

	public Cart() {

		setGoods(new HashMap<Good, Integer>());
		setTotalPrice(0.0);

	}

	public boolean addToCart(Good Good, int number) {

		if (goods.containsKey(Good)) {
			goods.put(Good, goods.get(Good) + number);
		} else {
			goods.put(Good, number);
		}


		countPrice();
		return true;
	}

	public boolean removeToCart(Good item) {
		goods.remove(item);
		countPrice();
		return true;

	}

	public Double countPrice() {
		double sum = 0.0;
		Set<Good> keys = goods.keySet();
		Iterator<Good> iterator = keys.iterator();
		while (iterator.hasNext()) {

			Good i = iterator.next();
			sum += i.getGprice() * goods.get(i);

		}
		this.setTotalPrice(sum);
		return this.getTotalPrice();

	}

	@Override
	public String toString() {
		return "Cart [goods=" + goods + ", totalPrice=" + totalPrice + "]";
	}

	public HashMap<Good, Integer> getGoods() {
		return goods;
	}

	public void setGoods(HashMap<Good, Integer> goods) {
		this.goods = goods;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
