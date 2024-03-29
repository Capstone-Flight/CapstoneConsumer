package com.capstone.consumer.bindings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Bindings class used for representing Rectangle no-fly zone data
 */
@XmlRootElement(
        name = "RectangleNoFlyZone"
)
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(
        localName = "RectangleNoFlyZone"
)
@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class RectangleNoFlyZone {

    @JsonProperty("name")
    @JacksonXmlProperty(
            localName = "name"
    )
    @XmlElement(
            name = "name"
    )
    public String name;

    @JsonProperty("westLongDegree")
    @JacksonXmlProperty(
            localName = "westLongDegree"
    )
    @XmlElement(
            name = "westLongDegree"
    )
    public float westLongDegree;

    @JsonProperty("eastLongDegree")
    @JacksonXmlProperty(
            localName = "eastLongDegree"
    )
    @XmlElement(
            name = "eastLongDegree"
    )
    public float eastLongDegree;

    @JsonProperty("southLatDegree")
    @JacksonXmlProperty(
            localName = "southLatDegree"
    )
    @XmlElement(
            name = "southLatDegree"
    )
    public float southLatDegree;

    @JsonProperty("northLatDegree")
    @JacksonXmlProperty(
            localName = "northLatDegree"
    )
    @XmlElement(
            name = "northLatDegree"
    )
    public float northLatDegree;

    public RectangleNoFlyZone(String zone_name, float westLongDegree, float eastLongDegree, float southLatDegree, float northLatDegree, float rotationDegree, float maxAltitude, float minAltitude) {
        this.name = zone_name;
        this.westLongDegree = westLongDegree;
        this.eastLongDegree = eastLongDegree;
        this.southLatDegree = southLatDegree;
        this.northLatDegree = northLatDegree;
        this.rotationDegree = rotationDegree;
        this.maxAltitude = maxAltitude;
        this.minAltitude = minAltitude;
    }

    public RectangleNoFlyZone() {}

    public float rotationDegree;
    public float maxAltitude;
    public float minAltitude;

    @Override
    public String toString() {
        return "RectangleNoFlyZone{" +
                "zone_name='" + name + '\'' +
                ", westLongDegree='" + westLongDegree + '\'' +
                ", eastLongDegree='" + eastLongDegree + '\'' +
                ", southLatDegree='" + southLatDegree + '\'' +
                ", northLatDegree='" + northLatDegree + '\'' +
                ", rotationDegree='" + rotationDegree + '\'' +
                ", maxAltitude=" + maxAltitude +
                ", minAltitude=" + minAltitude +
                '}';
    }
}
