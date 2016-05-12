package gpig.all.schema.datatypes;

import gpig.all.schema.DataType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="flow")
public class Flow extends DataType {
    public final static String remarks = "Water flow in m^3s^-1";

    @XmlElement(name="flow")
    public float flow;

}
