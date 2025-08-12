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





public bool dcpl_radar() {
    if (radar != null) {
        Action hideRadar = () => {
            radar.Visible = false;
            radar = null;
        };
        if (radar.InvokeRequired)
            radar.BeginInvoke(hideRadar);
        else
            hideRadar();
        return true;
    }
    return false;
}


