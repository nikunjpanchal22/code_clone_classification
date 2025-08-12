        public void run () {
            System.out.println (ARRAY_ELEMENTS [index]);
            index ++;
            if (index >= ARRAY_ELEMENTS.length) {
                utilTimer.cancel ();
            }
}





public void run () {
            if (index < ARRAY_ELEMENTS.length) {
                printArrayElementAndIncreaseIndex();
            }
            else {
                utilTimer.cancel ();
            }
        }
        private void printArrayElementAndIncreaseIndex() {
            System.out.println(ARRAY_ELEMENTS[index]);
            index++;
}


