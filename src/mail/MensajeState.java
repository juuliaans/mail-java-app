/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mail;

/**
 *
 * @author juliansantaana
 */
public interface MensajeState {
    
    boolean canDelete();
    boolean isRead();
    void openMessage(Mensaje ctx);
    
}
