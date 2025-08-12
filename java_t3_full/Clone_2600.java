        public void run () {
            System.out.println (ARRAY_ELEMENTS [index]);
            index ++;
            if (index >= ARRAY_ELEMENTS.length) {
                utilTimer.cancel ();
            }
}





public void run () {
    System.out.println (Arrays.asList(ARRAY_ELEMENTS).get(index++));
    if (index >= ARRAY_ELEMENTS.length) {
        utilTimer.cancel ();
    }
}


