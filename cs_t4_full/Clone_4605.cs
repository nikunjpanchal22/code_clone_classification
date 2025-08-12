public void EnableControls (ControlCollection ctrl, bool isEnable) {
    foreach (Control item in ctrl) {
        if (item.HasControls ())
            EnableControls (item.Controls, isEnable);
        else if (item is WebControl)
            ((WebControl) item).Enabled = isEnable;
        else if (item is HtmlControl)
            ((HtmlControl) item).Disabled = ! isEnable;
    }
}


 public void EnableControls (ControlCollection ctrl, bool isEnable) {
    foreach (Control item in ctrl) {
        if (item.HasControls ()) {
            EnableControls (item.Controls, isEnable);
        }
        else {
            if (item is WebControl) {
                try {
                    ((WebControl)item).Enabled = isEnable;
                }
                catch (Exception e) {
                    // handle exception
                }
            }
            else if (item is HtmlControl) {
                ((HtmlControl)item).Disabled = !isEnable;
            }
        }
    }
}


