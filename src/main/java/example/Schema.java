package example;

import gpig.all.schema.*;
import gpig.all.schema.datatypes.Blockage;
import gpig.all.schema.datatypes.Delivery;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Date;
import java.util.HashSet;

/**
 * Created by james on 12/05/2016.
 */
public class Schema {
    public static void main(final String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext = JAXBContext.newInstance(GPIGData.class);


        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                File file = new File(args[0]);
                file.createNewFile();
                StreamResult result = new StreamResult(file);
                result.setSystemId(file.toURI().toURL().toString());
                return result;
            }
        });

    }


}
