        public void run () {
            System.out.println (++ n);
}




public void run () {
    n += 1;
    synchronized (this) {
       System.out.println(n);
    }
}


