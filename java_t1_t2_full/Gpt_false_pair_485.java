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
        return new SpeedoStateLow ();
    } else if (speed > getHighRange ()) {
        onHighTransition ();
        return new SpeedoStateHigh ();
    } else {
        return this;
    }
}
