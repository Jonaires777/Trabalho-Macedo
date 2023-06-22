class InboxView extends Observer {
	InboxModel subject;

	InboxView (InboxModel subject) {
      	  this.subject = subject;
          this.subject.attach(this); 
        }

	void update () {
	    System.out.println("email recebido->"+subject.getSender());
		System.out.println("email recebido->"+subject.getReceiver());
		System.out.println("email recebido->"+subject.getMessage());
        }
}
