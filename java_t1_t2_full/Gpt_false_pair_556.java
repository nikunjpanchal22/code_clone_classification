        public void run () {
            System.out.println (ARRAY_ELEMENTS [index]);
            index ++;
            if (index >= ARRAY_ELEMENTS.length) {
                utilTimer.cancel ();
            }
}



  public void run() {
        for(int i=0; i < ARRAY_ELEMENTS.length; i++) {
            System.out.println(ARRAY_ELEMENTS[index]);
            index++;
            if(index >= ARRAY_ELEMENTS.length) {
                utilTimer.cancel();
            } 
        } 
}
