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
        return new LowSpeedState ();
    } else if (speed > getHighRange ()) {
        onHighTransition ();
        return new HighSpeedState ();
    } else {
        return this;
    }
}
