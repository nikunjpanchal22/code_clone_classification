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
        return states.get("low");
    } else if (speed > getHighRange ()) {
        onHighTransition ();
        return states.get("high");
    } else {
        return this;
    }
}
