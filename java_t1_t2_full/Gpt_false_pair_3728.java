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


public void run () {
    synchronized (this) {
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
}
