class Main {
     

     public static void main (String args[]) {
        
	InboxModel im = new InboxModel();

	InboxView iv = new InboxView (im);	
 
	InboxController ic = new InboxController (im);

        ic.processInput("teste","eu","voce");
     
  	
     }
}
