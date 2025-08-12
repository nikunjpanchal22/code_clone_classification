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
    Speedo result = this;

    if (speed < getLowRange()) {
        result = onLowTransition();
    }

    else if (speed > getHighRange()) {
        result = onHighTransition();
    }

    return result;
}


