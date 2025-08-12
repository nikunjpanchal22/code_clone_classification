        public void run () {
            System.out.println (++ n);
}




public void run () {
        System.out.println(addOne());
    }

    private synchronized int addOne() {
        return ++n;
}


