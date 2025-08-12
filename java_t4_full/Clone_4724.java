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
    if (! this.indefinite) {
        if (repeatTimes > 0) {
            execution.run();
            repeatTimes--;
        } else {
            director.halt(false);
        }
    } else {
        execution.run();
    }
}


