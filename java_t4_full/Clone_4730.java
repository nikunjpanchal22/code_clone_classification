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
    if (! this.neverEnding) {
        if (revolutions > 0) {
            activity.run();
            revolutions--;
        } else {
            overseer.disconnect(false);
        }
    } else {
        activity.run();
    }
}


