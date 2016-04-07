/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author Ana Teresa
 */
class USAddress extends Address {

    private static final String COUNTRY = "UNITED STATES";
    private static final String COMMA = ",";

    @Override
    public String getCountry() {
        return COUNTRY;
    }

    @Override
    public String getFullAddress() {
        return getStreet() + EOL_STRING
                + getCity() + COMMA + SPACE
                + getRegion() + SPACE
                + getPostalCode() + EOL_STRING + COUNTRY + EOL_STRING;
    }
}
