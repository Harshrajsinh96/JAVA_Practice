public class Reference {

	 private int number;
	    private String text;

	    Reference(String text, int number) {
	        this.text = text;
	        this.number = number;
	    }

	    public String getText() {
	        return text;
	    }

	    public int getNumber() {
	        return number;
	       
	    }

		public void setNumber(int number) {
			this.number = number;
		}

		public void setText(String text) {
			this.text = text;
		}
	    
}
