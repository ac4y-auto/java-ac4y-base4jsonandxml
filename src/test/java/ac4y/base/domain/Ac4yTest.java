package ac4y.base.domain;

import org.junit.jupiter.api.Test;
import javax.xml.bind.JAXBException;
import static org.junit.jupiter.api.Assertions.*;

public class Ac4yTest {

    @Test
    public void testGetAsJson() {
        Ac4y ac4y = new Ac4y();
        ac4y.getAc4yIdentification().setHumanId("testObject");

        String json = ac4y.getAsJson();

        assertNotNull(json);
        assertTrue(json.contains("testObject"));
    }

    @Test
    public void testGetFromJson() {
        Ac4y original = new Ac4y();
        original.getAc4yIdentification().setHumanId("jsonTest");

        String json = original.getAsJson();
        Object restored = original.getFromJson(json);

        assertNotNull(restored);
        assertTrue(restored instanceof Ac4y);
    }

    @Test
    public void testGetAsXml() throws JAXBException {
        Ac4y ac4y = new Ac4y();
        ac4y.getAc4yIdentification().setHumanId("xmlTest");

        String xml = ac4y.getAsXml();

        assertNotNull(xml);
        assertTrue(xml.contains("<?xml"));
        assertTrue(xml.contains("xmlTest"));
    }

    @Test
    public void testGetFromXml() throws JAXBException {
        Ac4y original = new Ac4y();
        original.getAc4yIdentification().setHumanId("xmlRoundTrip");

        String xml = original.getAsXml();
        Object restored = original.getFromXml(xml);

        assertNotNull(restored);
        assertTrue(restored instanceof Ac4y);
    }

    @Test
    public void testJsonRoundTrip() {
        Ac4y original = new Ac4y();
        original.getAc4yIdentification().setHumanId("roundTripTest");
        original.setSerializing("test data");

        String json = original.getAsJson();
        Ac4y restored = (Ac4y) original.getFromJson(json);

        assertNotNull(restored);
        assertEquals(original.getAc4yIdentification().getHumanId(),
                     restored.getAc4yIdentification().getHumanId());
    }
}
