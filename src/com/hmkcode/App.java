package com.hmkcode;

import com.hmkcode.vo.Content;

/**
 * author @ pku@iastate.edu
 *
 */
public class App 
{   private String alert = "";
    public void main( String[] args )
    {
        System.out.println( "Sending POST to GCM" );
        
        String apiKey = "AIzaSyC0WDMFC8LDctE83m-ROFcnJYANIg1FmgM";
        Content content = createContent();
        
        POST2GCM.post(apiKey, content);
    }
    
    public  void sendAlert(String alert)
    {   this.alert = alert;
        System.out.println( "Sending POST to GCM" );
        System.out.println( "alert type=" + alert);

        String apiKey = "AIzaSyC0WDMFC8LDctE83m-ROFcnJYANIg1FmgM";
        Content content = createContent();
        
        POST2GCM.post(apiKey, content);
    }
    
    public  Content createContent(){
		
		Content c = new Content();
		
		c.addRegId("dpizFPgPbf8:APA91bEpr4ApSlAYY07xN76BNyRpnja9j5cGi310DibuHxLev47FIPriVYd33agAiuZsrslBJtadWhmEejB1A4EeDOsbHZaxLjc3inXQ4dAUkB3zRAoGmXppFHZto22EU1sAJDSLzgQF");
		c.addRegId("dG_SF6f2Xi4:APA91bHOLh-Ckbjjhd8I-p77Js2FWd5p2KbgCIGbwzm7_wP-osrDOJy_wzfm7Ov1yvzezCaXQCAtNkUxJOzN_Ul5SKdrXCPH50BRDkvvL8CO-lvm5xfr7QKZsuUfKSDd9y2qLrzSVcAL:id");
		c.createData("Test Title", this.alert);
		
		return c;
	}
}
