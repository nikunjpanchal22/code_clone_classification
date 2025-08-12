public Speedo manage (int speed) {
    if (speed < getLowRange ()) {
        onLowTransition ();
        return getLowState ();
    } else if (speed > getHighRange ()) {
        onHighTransition ();
        return getHighState ();
    } else {
        return this;
    }
}


 public Speedo manage (int speed) {
    if (speed < getLowRange ()) {
        onLowTransition ();
        return speedoController.getLowSpeedState();
    } else if (speed > getHighRange ()) {
        onHighTransition ();
        return speedoController.getHighSpeedState();
    } else {
        return this;
    }
}
