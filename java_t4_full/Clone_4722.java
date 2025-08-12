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
    if (! this.runningInfinite) {
        if (loopCounter > 0) {
            function.run();
            loopCounter--;
        } else {
            controller.stop(false);
        }
    } else {
        function.run();
    }
}


