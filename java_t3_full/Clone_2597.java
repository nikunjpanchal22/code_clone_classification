        public void run () {
            System.out.println (ARRAY_ELEMENTS [index]);
            index ++;
            if (index >= ARRAY_ELEMENTS.length) {
                utilTimer.cancel ();
            }
}





public void run () {
    try {
        System.out.println (ARRAY_ELEMENTS [index]);
    }
    finally {
        index ++;
        if (index >= ARRAY_ELEMENTS.length) {
            utilTimer.cancel ();
        }
    }
}


