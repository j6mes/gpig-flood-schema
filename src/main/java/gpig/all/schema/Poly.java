package gpig.all.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="boundingbox")
public class Poly extends Position {
    @XmlElement(name="coords")
    public List<Coord> coords;
    
}
