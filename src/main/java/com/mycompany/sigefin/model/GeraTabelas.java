/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sigefin.model;

import javax.persistence.Persistence;

/**
 *
 * @author gleyw
 */
public class GeraTabelas {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("sigefinPU");
    }
}
