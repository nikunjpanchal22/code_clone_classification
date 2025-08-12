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
    int lowRange = getLowRange();
    int highRange = getHighRange();
    return (speed < lowRange) ? onLowTransition() : 
    (speed > highRange) ? onHighTransition() : this; 
}


