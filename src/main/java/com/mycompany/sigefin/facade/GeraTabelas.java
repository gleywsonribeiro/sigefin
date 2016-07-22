/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sigefin.facade;

import javax.ejb.Stateless;
import javax.persistence.Persistence;

/**
 *
 * @author gleyw
 */
@Stateless
public class GeraTabelas {
    public void geraTabelas(String context) {
        Persistence.createEntityManagerFactory(context);
    }
}
