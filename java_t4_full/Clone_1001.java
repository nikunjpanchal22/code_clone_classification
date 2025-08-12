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


 public synchronized void execute() {
        if (this.infinite) {
            while (this.infinite) {
                this.command.run();
            }
        } else {
            int repeatCounter = this.repeatCounter;
            while (repeatCounter-- > 0) {
                this.command.run();
            }
            this.control.cancel(false);
        }
}


