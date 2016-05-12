package gpig.all.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="gid")
public class GISPosition {

    @XmlElement(name="position")
    public Position position;

    @XmlElement(name="timestamp")
    public Timestamp timestamp;

    @XmlElement(name="value")
    public DataType payload;

}
