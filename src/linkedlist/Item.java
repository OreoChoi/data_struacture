package linkedlist;

import java.util.Objects;

public class Item {
	private String name;
	private Long price;

	public Item(String name, Long price) {
		this.name = name;
		this.price = price;
	}

	public static Item of(String name, Long price) {
		return new Item(name, price);
	}

	@Override
	public String toString() {
		return name + "/" + price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		if (super.equals(obj)) {
			return true;
		}

		Item item = (Item)obj;
		return Objects.equals(this.name, item.name) && Objects.equals(this.price, item.price);
	}
}
