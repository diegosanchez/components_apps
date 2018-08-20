package vertical;

import payment.Payment;
import shipping.Shipping;

public class Boleto implements Payment {
    @Override
    public Object promise(Shipping s) {
        return "Tenes q pagar <TICKET> antes de recibirlo";
    }
}
