package gpig.all.schema;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="timestamp")
public class Timestamp {

    @XmlAttribute(name="date")
    public Date date;
}
