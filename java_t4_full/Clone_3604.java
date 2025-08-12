        public void run () {
            System.out.println (ARRAY_ELEMENTS [index]);
            index ++;
            if (index >= ARRAY_ELEMENTS.length) {
                utilTimer.cancel ();
            }
}





public void run() {
            printArrayElement(index++);
            if(index > ARRAY_ELEMENTS.length - 1) {
                utilTimer.cancel();
            }
        }
        private void printArrayElement(int index) {
            System.out.println(ARRAY_ELEMENTS[index]);
}


