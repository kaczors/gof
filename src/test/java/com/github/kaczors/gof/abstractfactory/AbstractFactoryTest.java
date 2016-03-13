/*
 * This document set is the property of GTECH Corporation, Providence,
 * Rhode Island, and contains confidential and trade secret information.
 * It cannot be transferred from the custody or control of GTECH except as
 * authorized in writing by an officer of GTECH. Neither this item nor
 * the information it contains can be used, transferred, reproduced, published,
 * or disclosed, in whole or in part, directly or indirectly, except as
 * expressly authorized by an officer of GTECH, pursuant to written agreement.
 *
 * Copyright 2015 GTECH Corporation. All Rights Reserved.
 */
package com.github.kaczors.gof.abstractfactory;

import org.testng.annotations.Test;

public class AbstractFactoryTest {

    @Test
    public void usage(){
        Country poland = new Country("Poland", new FordPartFactory());
        Country slovakia = new Country("Slovakia", new OpelPartsFactory());

        Wheel wheelFromPoland = poland.createWheel();
        Wheel wheelFromSlovakia = slovakia.createWheel();
    }

}