/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lock;

/**
 *
 * @author cackerman
 */
public class pick {
    
    private int pos;
    
    public pick(int p){
        pos = p;
    }
    
    public int getPos(){
        return pos;
    }
    
    public void setPos(int p){
        pos = p;
    }
    
    public boolean testPick(lock L){
        if(pos==L.getKey()){
            
        }
    }
}
