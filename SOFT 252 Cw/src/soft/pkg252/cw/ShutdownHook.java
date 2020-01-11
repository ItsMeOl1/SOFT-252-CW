/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft.pkg252.cw;

public class ShutdownHook { //used to save the data whent he program is shut down
    static Controller control;
    public static void run(Controller c) {
        control = c;
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Shutdown Hook is running !"); 
                control.save();
            }        
        });         
    }
}

