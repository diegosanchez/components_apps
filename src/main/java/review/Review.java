package review;

import shipping.Shipping;

import java.util.HashMap;
import java.util.Map;

public class Review {
    public Map render(Shipping s) {
        Map result = new HashMap<String,Object>();

        result.put("review.shipping", s.promise());

        return result;
    }
}
