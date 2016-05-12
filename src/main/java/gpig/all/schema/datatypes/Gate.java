package gpig.all.schema.datatypes;

import gpig.all.schema.DataType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 12/05/2016.
 */


@XmlRootElement(name="gate")
public class Gate extends DataType {
    public final static String remarks = "Gate position from 0.0 to 1.0";

    @XmlElement(name="position")
    public float position;

}
