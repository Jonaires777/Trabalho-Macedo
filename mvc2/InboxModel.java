class InboxModel extends Subject {

	String sender;
        String receiver;
	String message;

	void setSender (String sender) {
          this.sender = sender;
          this.notifyObservers();
        }

	String getSender () {
          return this.sender;
  	}

	void setReceiver (String receiver) {
          this.receiver = receiver;
          this.notifyObservers();
        }

	String getReceiver () {
          return this.receiver;
  	}

	void setMessage (String message) {
          this.message = message;
          this.notifyObservers();
        }

	String getMessage () {
          return this.message;
  	}
}
