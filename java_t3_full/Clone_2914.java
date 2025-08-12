public static void main (String [] args) throws InterruptedException {
    while (makeMore) {
        new Leakee (0).check ();
    }
    while (true) {
        Thread.sleep (1000);
        System.out.println ("memory=" + Runtime.getRuntime ().freeMemory () + " / " + Runtime.getRuntime ().totalMemory ());
    }
}





public static void main (String [] args) throws InterruptedException {
            while (makeMore) {
                Leakee leakee = new Leakee (0);
                leakee.check ();
            }

            while (true) {
                printMemoryInfo();
                Thread.sleep (1000);
            }
        }

        private static void printMemoryInfo() {
            System.out.println ("memory=" + Runtime.getRuntime ().freeMemory () + " / " + Runtime.getRuntime ().totalMemory ());
}


