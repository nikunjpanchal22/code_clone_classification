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


  public synchronized void runLoop() {
        if (this.infinite) {
            while (this.infinite)
                this.command.run();
        } else if (this.repeatCounter > 0) {
            while (this.repeatCounter-- > 0)
                this.command.run();
        } else {
            this.control.cancel(false);
        }
}


