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
public class USPhoneNumber extends PhoneNumber {

    private static final String COUNTRY_CODE = "01";
    private static final int NUMBER_LENGTH = 10;

    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    @Override
    public void setPhoneNumber(String newNumber) {
        if (newNumber.length() == NUMBER_LENGTH) {
            super.setPhoneNumber(newNumber);
        }
    }
}
