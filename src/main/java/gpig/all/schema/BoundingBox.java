package gpig.all.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="boundingbox")
public class BoundingBox extends Position {
    @XmlElement(name="topleft")
    public Coord topleft;

    @XmlElement(name="topright")
    public Coord topright;
}
