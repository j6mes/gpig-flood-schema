package gpig.all.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="point")
public class Point extends Position {
    @XmlElement(name="position")
    public Coord coord;
}
