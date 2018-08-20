package payment;

import shipping.Shipping;

public interface Payment {
    Object promise(Shipping s);
}
