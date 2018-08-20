package vertical;

import payment.Payment;
import shipping.Shipping;

public class Store implements Shipping {
    Payment payment;

    Shipping paidWith(Payment p) {
        this.payment = p;
        return this;
    }

    @Override
    public Object promise() {
        return payment.promise(this);
    }

    @Override
    public Object promiseOnline() {
        return "Llega el XXXX";
    }
}
