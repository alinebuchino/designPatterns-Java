package br.com.cod3r.factory.apple.factory;

import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhone11;
import br.com.cod3r.factory.apple.model.IPhone11Pro;
import br.com.cod3r.factory.apple.model.IPhoneX;
import br.com.cod3r.factory.apple.model.IPhoneXSMax;

public abstract class IPhoneFactory {

    public static IPhone createIPhone(String generation, String level) {

        IPhone cellPhone = null;

        if ("X".equals(generation)) {
            if ("standard".equals(level)) {
                cellPhone = new IPhoneX();
            } else if ("HighEnd".equals(level)) {
                cellPhone = new IPhoneXSMax();
            }
        }
        if ("11".equals(generation)) {
            if ("standard".equals(level)) {
                cellPhone = new IPhone11();
            } else if ("HighEnd".equals(level)) {
                cellPhone = new IPhone11Pro();
            }
        }

        cellPhone.assemble();
        cellPhone.certificates();
        cellPhone.pack();
        cellPhone.getHardware();

        return cellPhone;
    }

}
