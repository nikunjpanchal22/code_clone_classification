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
    if (! this.eternal) {
        if (roundsLeft > 0) {
            action.run();
            roundsLeft--;
        } else {
            supervisor.finish(false);
        }
    } else {
        action.run();
    }
}


