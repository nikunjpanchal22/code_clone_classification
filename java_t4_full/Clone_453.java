        public void run () {
            ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint ();
}


 public void run() {
	 ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint();
	 if(rVR.validate()){
	   rVR.run();
	 }else{
	   rVR.init();
	   rVR.run();
	 }
}


