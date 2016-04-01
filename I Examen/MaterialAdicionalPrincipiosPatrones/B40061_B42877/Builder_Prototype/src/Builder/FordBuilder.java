    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Builder;

    /**
     *
     * @author guiselleH
     */
    public class FordBuilder extends CarBuilder{
        public void buildEngine() {
            Engine eng = new Engine();
            eng.setCylinderCapacity(2600);
            eng.setNumberOfCylinders(8);
            car.setEngine(eng);
        }
        
        @Override
        public void buildModel() {
            car.setModel("ranger");
        }

        @Override
        public void buildTradeMark() {
            car.setTrademark("ford");
        }

        @Override
        public void buildYear() {
            car.setYear(2004);
        }
    }
