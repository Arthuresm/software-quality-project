/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.util.UUID;

/**
 *
 * @author uriel
 */
public class Random {
    public static String GetUUID(){
        return  UUID.randomUUID().toString();
    }
}
