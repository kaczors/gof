package com.github.kaczors.gof.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

abstract class PartComposite implements Part{

    Collection<Part> subParts = new ArrayList<Part>();

    void addSubPart(Part part){
        subParts.add(part);
    }

}
