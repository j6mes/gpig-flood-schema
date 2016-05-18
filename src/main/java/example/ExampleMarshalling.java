package example;

import gpig.all.schema.*;
import gpig.all.schema.datatypes.Blockage;
import gpig.all.schema.datatypes.Delivery;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by james on 12/05/2016.
 */
public class ExampleMarshalling {
    public static void main(String[] args) {
        exampleCoord();
        exampleTimestamp();
        examplePoint();
        exampleBoundingBox();

        exampleBlockageInBoundingBox();

        exampleDeliveryInArea();

    }

    private static void examplePoint() {
        StringWriter sw = new StringWriter();

        Coord coord = new Coord();
        coord.latitude = 12.345f;
        coord.longitude = 56.789f;


        Point pos = new Point();
        pos.coord = coord;

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Point.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(pos, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println(sw);
    }


    private static void exampleBlockageInBoundingBox() {
        StringWriter sw = new StringWriter();


        Timestamp ts = new Timestamp();
        ts.date = new Date();

        Coord coord = new Coord();
        coord.latitude = 12.3f;
        coord.longitude = 4.56f;

        Coord coord1 = new Coord();
        coord1.latitude = 7.8f;
        coord1.longitude = 9.0f;

        BoundingBox pos = new BoundingBox();
        pos.topleft = coord;
        pos.topright = coord1;

        Blockage blockage = new Blockage();
        Image blockageimg = new Image();
        blockageimg.url="http://10.1.1.1/images/image1.jpg";
        blockage.image = blockageimg;

        GISPosition gis = new GISPosition();
        gis.position = pos;
        gis.timestamp = ts;
        gis.payload = blockage;

        GPIGData data = new GPIGData();
        data.positions = new HashSet<>();
        data.positions.add(gis);


        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(GPIGData.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(data, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println(sw);
    }


    private static void exampleDeliveryInArea() {
        StringWriter sw = new StringWriter();


        Timestamp ts = new Timestamp();
        ts.date = new Date();

        Coord coord = new Coord();
        coord.latitude = 12.3f;
        coord.longitude = 4.56f;

        Coord coord1 = new Coord();
        coord1.latitude = 7.8f;
        coord1.longitude = 9.0f;

        Polar pos = new Polar();
        pos.point = coord;
        pos.radius = 10.0f;


        Delivery del = new Delivery();

        GISPosition gis = new GISPosition();
        gis.position = pos;
        gis.timestamp = ts;
        gis.payload = del;

        GPIGData data = new GPIGData();
        data.positions = new HashSet<>();
        data.positions.add(gis);


        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(GPIGData.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(data, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println(sw);
    }


    private static void exampleBoundingBox() {
        StringWriter sw = new StringWriter();

        Coord coord = new Coord();
        coord.latitude = 12.3f;
        coord.longitude = 4.56f;

        Coord coord1 = new Coord();
        coord1.latitude = 7.8f;
        coord1.longitude = 9.0f;

        BoundingBox pos = new BoundingBox();
        pos.topleft = coord;
        pos.topright = coord1;

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(BoundingBox.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(pos, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println(sw);
    }

    private static void exampleCoord() {
        StringWriter sw = new StringWriter();

        Coord coord = new Coord();
        coord.latitude = 12.345f;
        coord.longitude = 56.789f;


        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Coord.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(coord, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println(sw);
    }

    private static void exampleTimestamp() {
        StringWriter sw = new StringWriter();

        Timestamp ts = new Timestamp();
        ts.date = new Date();


        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Timestamp.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(ts, sw);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        System.out.println(sw);
    }
}
