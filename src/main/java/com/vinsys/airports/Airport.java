package com.vinsys.airports;

/**
 * @author Nilesh Devdas
 * @version 1.0
 * Airport Model Class to Hold State of Airport  Attributes
 */
public class Airport {

    private String name;
    private String type;
    private String country;

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    /**
     * if you wish 2 object to compared
     */

}

