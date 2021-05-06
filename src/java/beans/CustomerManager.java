/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author Fincode
 */
@Stateless
public class CustomerManager {

    public int getCustomerCount() {
        return 50;
    }
    
    public int getCustomerCountByRegion(String region ) {
        
        if(region.equalsIgnoreCase("west")) {
            return 20;
        } else if(region.equalsIgnoreCase("east")) {
            return 30;
        } else {
            return 0;
        }
    }
}
