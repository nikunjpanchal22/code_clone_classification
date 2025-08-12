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
    Speedo speedo = this;
    if (speed < getLowRange ()) {
        speedo = onLowTransition();
    }
    else if (speed > getHighRange ()) {
        speedo = onHighTransition();
    }
    return speedo;
}


