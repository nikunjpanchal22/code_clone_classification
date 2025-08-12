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
        return SpeedoState.LOW;
    } else if (speed > getHighRange ()) {
        onHighTransition ();
        return SpeedoState.HIGH;
    } else {
        return this;
    }
}
