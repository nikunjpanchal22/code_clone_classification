        public void run () {
            ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint ();
}


 public void run() {
	 ValidateRevalidateRepaint rVR = new ValidateRevalidateRepaint();
	 if(rVR.check())
	   rVR.run();
	 else
	   throw new CheckException();
}


