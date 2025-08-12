        public void run () {
            System.out.println (ARRAY_ELEMENTS [index]);
            index ++;
            if (index >= ARRAY_ELEMENTS.length) {
                utilTimer.cancel ();
            }
}





public void run () {
    String temp = Arrays.toString(ARRAY_ELEMENTS);
    System.out.println (temp.substring(index,index+1));
    index ++;
    if (index >= ARRAY_ELEMENTS.length) {
        utilTimer.cancel ();
    }
}


