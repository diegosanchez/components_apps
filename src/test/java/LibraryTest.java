/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;
import payment.Payment;
import shipping.Shipping;
import vertical.Direct;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void testCaseStoreVisa() {
        Direct d = new Direct();

        Map expected = new HashMap<String, Object>(){{
            put("review.shipping", "Llega el XXXX");
        }};

        assertEquals(expected, d.caseStoreVisa());

    }

    @Test
    public void testCaseStoreBoleto() {
        Direct d = new Direct();

        Map expected = new HashMap<String, Object>(){{
            put("review.shipping", "Tenes q pagar <TICKET> antes de recibirlo");
        }};

        assertEquals(expected, d.caseStoreBoleto());

    }}
