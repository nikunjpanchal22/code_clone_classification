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


 public synchronized void invoke() {
        if (this.infinite) {
            do {
                this.command.run();
            } while (this.infinite);
        } else {
            for (int i = this.repeatCounter; i > 0; i--) {
                this.command.run();
            }
            this.control.cancel(false);
        }
}


