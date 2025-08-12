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
        return SpeedoStateFactory.inputLowInput();
    } else if (speed > getHighRange ()) {
        onHighTransition ();
        return SpeedoStateFactory.inputHighInput();
    } else {
        return this;
    }
}
