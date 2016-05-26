/*
 * Calculator
 * Date of creation: 2014-05-28
 * 
 * Copyright (c) CompuGROUP Software GmbH, 
 * This software is the confidential and proprietary information of
 * CompuGROUP Software GmbH. You shall not disclose such confidential
 * information and shall use it only in accordance with the terms of
 * the license agreement you entered into with CompuGROUP Software GmbH.
 */

package com.cg.example.server.webservice;

import com.cg.helix.context.annotation.SingletonScope;
import com.cg.helix.mib.server.annotation.Component;

/**
 * @author Hans Kohlreiter, COREFT
 */
@SingletonScope
@Component
public class CalculatorServiceImpl implements CalculatorService {

    public int add(int a, int b) {
        return a + b;
    }
}
