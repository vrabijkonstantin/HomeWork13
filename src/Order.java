import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    public String getCustomer() {
        return customer;
    }

    public Product[] getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "Заказ[покупатель=" + customer + ", товары=" + Arrays.toString(basket) + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order other = (Order) o;
        if (!Objects.equals(customer, other.customer)) {
            return false;
        }
        if (basket == null && other.basket == null) {
            return true;
        }
        if (basket == null || other.basket == null) {
            return false;
        }
        if (basket.length != other.basket.length) {
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                if (other.basket[i] != null) {
                    return false;
                }
            } else if (!basket[i].equals(other.basket[i])) {
                return false;
            }
            if (basket[i] != null && other.basket[i] == null) {
                return false;
            }
        }
        return true;
    }
}