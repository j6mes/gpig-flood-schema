package gpig.all.schema;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="position")
@XmlSeeAlso({Arc.class,Point.class,BoundingBox.class,Polar.class,Poly.class})
public class Position {

}
