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
        return stateMap.get(speed).getState(SpeedoState.Low);
    } else if (speed > getHighRange ()) {
        onHighTransition ();
        return stateMap.get(speed).getState(SpeedoState.High);
    } else {
        return this;
    }
}
