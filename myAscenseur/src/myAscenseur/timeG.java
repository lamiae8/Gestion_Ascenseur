package myAscenseur;


import java.util.concurrent.TimeUnit;

public class timeG {
	
	
	TimeUnit  unit= null;
    long sleepTime = 0;
    
    public timeG( long time , TimeUnit  unit ) {
        this.unit = unit;
        this.sleepTime = time;
    }
    
    public void sleeptime() {
    	 try {
             this.unit.sleep( this.sleepTime );
         }
         catch(InterruptedException e) {
             e.printStackTrace();
         }
    }

}
