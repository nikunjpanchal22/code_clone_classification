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
        if (!this.infinite) {
            while (this.repeatCounter > 0) {
                this.command.run();
                this.repeatCounter--;
            }
            this.control.cancel(false);
        } else {
            do {
                this.command.run();
            } while (this.infinite);
        }
}


