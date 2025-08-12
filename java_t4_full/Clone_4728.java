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
    if (! this.continuous) {
        if (repeatNum > 0) {
            task.run();
            repeatNum--;
        } else {
            toggle.cancel(false);
        }
    } else {
        task.run();
    }
}


