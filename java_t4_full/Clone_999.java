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
        if (!this.infinite && this.repeatCounter > 0) {
            for (int i = this.repeatCounter; i > 0; i--) {
                this.command.run();
            }
        } else if (this.infinite) {
            while (this.infinite) {
                this.command.run();
            }
        } else {
            this.control.cancel(false);
        }
}


