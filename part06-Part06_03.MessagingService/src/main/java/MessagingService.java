/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agney
 */
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> msg;

    public MessagingService()
    {
        this.msg = new ArrayList<>();
    }

    public void add(Message message) {
        if(message.getContent().length()<=280){
            this.msg.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return msg;
    }
    
    
    
    
}
