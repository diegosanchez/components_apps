package vertical;

import review.Review;

import java.util.Map;

public class Direct {
    public Map caseStoreVisa() {
        Review r = new Review();
        Store store = new Store();

        return r.render(store.paidWith(new Visa()));

    }

    public Map caseStoreBoleto() {
        Review r = new Review();
        Store store = new Store();

        return r.render(store.paidWith(new Boleto()));
    }
}
