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


 public synchronized void run() {
        if (!this.infinite) {
            for (int i = 0; i < this.repeatCounter; i++) {
                this.command.run();
            }
            this.control.cancel(false);
        } else {
            while (this.infinite)
                this.command.run();
        }
}


