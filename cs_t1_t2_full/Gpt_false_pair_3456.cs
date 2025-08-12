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


public void EnableControls(ControlCollection ctrl, Boolean enable)
{
    foreach (Control control in ctrl)
    {
        if (control.HasControls())
            EnableControls(control.Controls, enable);
        else if (control is WebControl)
            ((WebControl)control).Enabled = enable;
        else if (control is HtmlControl)
            ((HtmlControl)control).Disabled = !enable;
    }
}
