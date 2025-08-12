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


public synchronized void run () {
    if (! this.infinite) {
        if (this.repeatCounter > 0) {
            this.command.execute ();
            this.repeatCounter --;
        } else {
            this.control.cancel (true);
        }
    } else {
        this.command.execute ();
    }
}
