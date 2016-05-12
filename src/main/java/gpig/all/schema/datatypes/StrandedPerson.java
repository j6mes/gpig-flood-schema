package gpig.all.schema.datatypes;

import gpig.all.schema.Image;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by james on 12/05/2016.
 */

@XmlRootElement(name="strandedperson")
public class StrandedPerson {
    @XmlElement(name="image")
    public Image image;

}
