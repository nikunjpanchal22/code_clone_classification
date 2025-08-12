public synchronized void run () {
    if (! this.infinite) {
        if (this.repeatCounter > 0) {
            this.command.run ();
            this.repeatCounter --;
        } else {
            this.control.cancel (false);
        }
    } else {
        this.command.run ();
    }
}


 public synchronized void launch() {
        if (!this.infinite) {
            int counter = this.repeatCounter;
            while (counter > 0) {
                this.command.run();
                counter--;
            }
            this.control.cancel(false);
        } else {
            do {
                this.command.run();
            } while (this.infinite);
        }
}


