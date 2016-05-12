package gpig.all.schema;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

/**
 * Created by james on 12/05/2016.
 */
@XmlRootElement(name="gpigdata")
public class GPIGData {
    @XmlElement(name="positions")
    public Set<GISPosition> positions;
}
