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
    if (! this.endless) {
        if (repeat > 0) {
            runnable.run();
            repeat--;
        } else {
            taskControl.abort(false);
        }
    } else {
        runnable.run();
    }
}


