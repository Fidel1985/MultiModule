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

import com.cg.helix.mib.annotation.ComponentInterface;
import com.cg.helix.mib.annotation.Input;

/**
 * @author Hans Kohlreiter, COREFT
 */
@ComponentInterface
public interface CalculatorService {

    int add(@Input(name = "a") int a,
            @Input(name = "b") int b);

}
