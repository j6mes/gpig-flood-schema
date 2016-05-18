package example;

import gpig.all.schema.*;
import gpig.all.schema.datatypes.Blockage;
import gpig.all.schema.datatypes.Delivery;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by james on 12/05/2016.
 */
public class ExampleUnmarshalling {
    public static void main(String[] args) throws JAXBException {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<gpigdata>\n" +
                "    <gisposition>\n" +
                "        <position xsi:type=\"polar\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
                "            <point latitude=\"12.3\" longitude=\"4.56\"/>\n" +
                "            <radius>10.0</radius>\n" +
                "        </position>\n" +
                "        <timestamp date=\"2016-05-18T13:14:43.263+01:00\"/>\n" +
                "        <value xsi:type=\"delivery\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"/>\n" +
                "    </gisposition>\n" +
                "</gpigdata>";

        JAXBContext jc = JAXBContext.newInstance(GPIGData.class);
        Unmarshaller u = jc.createUnmarshaller();

        GPIGData data = (GPIGData) u.unmarshal(new StringReader(xml));

        System.out.println(data.positions.iterator().next().position);

    }

}
