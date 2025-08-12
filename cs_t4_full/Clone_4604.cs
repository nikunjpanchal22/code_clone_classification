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


 public void EnableControls(ControlCollection ctrl, bool isEnable) 
    {
        foreach (Control item in ctrl) 
        {
            if (item.HasControls()) 
            {
                EnableControls(item.Controls, isEnable);
            } 
            else 
            { 
                switch (item) 
                { 
                    case WebControl webControl: 
                        webControl.Enabled = isEnable; 
                        break; 
                    case HtmlControl htmlControl: 
                        htmlControl.Disabled = !isEnable; 
                        break; 
                } 
            } 
        }
    }


public void EnableControls(ControlCollection ctrl, bool isEnable)
{
    foreach (Control item in ctrl)
    {
        if (typeof(WebControl).IsAssignableFrom(item.GetType()))
        {
            ((WebControl)item).Enabled = isEnable;
        }
        else if (typeof(HtmlControl).IsAssignableFrom(item.GetType()))
        {
            ((HtmlControl)item).Disabled = !isEnable;
        }
 
        if (item.HasControls())
        {
            EnableControls(item.Controls, isEnable);
        }
    }
}


