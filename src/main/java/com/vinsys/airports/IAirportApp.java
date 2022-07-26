package com.vinsys.airports;

import java.util.List;

/**
 * Airport Application interfaces
 * @author Nilesh Devdas
 * @version 1.0
 * Contains all functions related to airport app.
 */
public interface IAirportApp {
    /**
     * Find all airport possibilities with the given string
     * @param string Should not be null Valid Values are only Strings and numbers
     * @return
     */
    List<Airport>  findAirportsByName(String string) throws InvalidInputException;
}






