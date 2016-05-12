package gpig.all.schema;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="boundingbox")
public class Polar extends Position {
    @XmlElement(name="point")
    public Coord point;

    @XmlElement(name="radius")
    public float radius;
}
