package vertical;

import payment.Payment;
import shipping.Shipping;

public class Visa implements Payment {
    @Override
    public Object promise(Shipping s) {
        return s.promiseOnline();
    }
}
