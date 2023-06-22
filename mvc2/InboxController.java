class InboxController {

 	InboxModel model;

	
	InboxController ( InboxModel model) {
               this.model = model;
        }

	InboxController ( InboxModel model, String message, String sender, String receiver ) {
  		this.model = model;
    		this.processInput(message, sender, receiver);
        }

	void processInput ( String message, String sender, String receiver ) {
		//this.model.setSender(sender);
  		//this.model.setReceiver(receiver);
		this.model.setMessage(message);
            }
}
