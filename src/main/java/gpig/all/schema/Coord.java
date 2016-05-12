package gpig.all.schema;

import javax.xml.bind.annotation.*;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="coord")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Coord {
    @XmlAttribute(name="latitude")
    public float latitude;

    @XmlAttribute(name="longitude")
    public float longitude;
}
