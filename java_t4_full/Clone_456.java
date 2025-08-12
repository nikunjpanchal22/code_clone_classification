        public void run () {
            ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint ();
}


 public void run() {
	 ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint();
	 if(!rVR.validate()){
	   throw new IllegalStateException("Validation failed");
	 }
	 rVR.run();
}


