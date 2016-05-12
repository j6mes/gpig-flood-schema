package gpig.all.schema;

import gpig.all.schema.datatypes.*;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="datatype")
@XmlSeeAlso({Blockage.class, Delivery.class, Depth.class,Flow.class,Gate.class, StrandedPerson.class, WaterEdge.class})
public class DataType {

}
