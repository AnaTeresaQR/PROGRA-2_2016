/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DependencyInversionPrinciple;

/**
 *
 * @author Micku
 */
public class Ferrari {

    private IMotor _motor;

    public Ferrari(IMotor motor) throws ArgumentNullException {
        if (motor == null) {
            throw new ArgumentNullException("engine");
        }
        _motor = motor;
    }

}
