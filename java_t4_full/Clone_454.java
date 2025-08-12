        public void run () {
            ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint ();
}


 public void run() {
	 ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint();
	 while(!rVR.validate()){
	  rVR.init();
	  rVR.repaint();
	 }
	 rVR.run();
}


