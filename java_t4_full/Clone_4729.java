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
    if (! this.unlimited) {
        if (repeatIndex > 0) {
            runner.run();
            repeatIndex--;
        } else {
            controlUnit.terminate(false);
        }
    } else {
        runner.run();
    }
}


