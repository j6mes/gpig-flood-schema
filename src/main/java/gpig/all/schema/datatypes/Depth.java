package gpig.all.schema.datatypes;

import gpig.all.schema.DataType;
import gpig.all.schema.Image;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="depth")
public class Depth extends DataType {
    public final static String remarks = "Water depth in m";

    @XmlElement(name="depth")
    public float depth;

}
