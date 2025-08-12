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
    if (! this.unending) {
        if (repeatCount > 0) {
            process.run();
            repeatCount--;
        } else {
            handler.breakLoop(false);
        }
    } else {
        process.run();
    }
}


