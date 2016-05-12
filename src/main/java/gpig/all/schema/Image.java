package gpig.all.schema;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="image")
public class Image {
    @XmlAttribute(name="url")
    public String url;

}
