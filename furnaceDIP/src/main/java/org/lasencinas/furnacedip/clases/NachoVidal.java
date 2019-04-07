
package org.lasencinas.furnacedip.clases;

import org.lasencinas.furnacedip.interfaces.Heater;


public class NachoVidal implements Heater{

    @Override
    public void engage(Habitacion temperatura) {
        temperatura.setAumentarTemperatura(1);
    }
    
    
    @Override
    public void disengage(Habitacion temperatura) {
        temperatura.setAumentarTemperatura(-1);
    }
    
    
    public void speak(){
            System.out.println("\nSe viene" + "\n" +
"...........///_\\\\ \n" +
"..........||.^|^\\ \n" +
"..........))_-_/ (( \n" +
"..........)'_/.\"._`) \n" +
"......././._..../... \n" +
".....././(_.x/._).| \n" +
".........)\".|.\"(/./ \n" +
".........'...'.. //./ \n" +
"......../....`..././ \n" +
".......|....__.. \n" +
".......|.../..../ \n" +
".......|..|...... \n" +
".......|..|....... \n" +
".......|..|........ \n" +
".......|..|......... \n" +
".......|..|.......... \n" +
".......|..|........... \n" +
"......./__..........|__ \n" +
"......_/.|............|._");
}
    
}
