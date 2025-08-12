public bool dcpl_radar () {
    if (radar == null)
        return false;
    else {
        if (radar != null) {
            if (radar.InvokeRequired)
                radar.BeginInvoke (new MethodInvoker (delegate () {
                    radar.Visible = false;
                    radar = null;
                }));
            else {
                this.radar.Visible = false;
                radar = null;
            }
        }
        return true;
    }
}



public bool dcpl_radar () {
    if (radar == null)
        return false;
    if (radar.InvokeRequired) {
        radar.BeginInvoke (new Action (() => {
            radar.Visible = false;
            radar = null;
        }));
    } else {
        radar.Visible = false;
        radar = null;
    }
    return true;
}


