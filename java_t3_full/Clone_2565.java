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
    if (speed < getLowRange()) {
        return onLowTransition();
    }
    else if (speed > getHighRange()) {
        return onHighTransition();
    }

    return this;
}


