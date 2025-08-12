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


 public void EnableControls (ControlCollection ctrl, bool isEnable)
    {
        foreach (Control item in ctrl)
        {
            if (item.HasControls ())
            {
                EnableControls (item.Controls, isEnable);
            }
            else
            {
                try
                {
                    if (item is WebControl)
                        ((WebControl) item).Enabled = isEnable;
                    else if (item is HtmlControl)
                        ((HtmlControl) item).Disabled = !isEnable;
                }
                catch (Exception ex)
                {
                    //Log exception
                }
            }
        }
    }

 public void EnableControls(ControlCollection ctrl, bool isEnable) 
    {  
        foreach (Control item in ctrl) 
        { 
            if (item is WebControl || item is HtmlControl) 
            { 
                if (item is WebControl) 
                    ((WebControl)item).Enabled = isEnable; 
                else if (item is HtmlControl) 
                    ((HtmlControl)item).Disabled = !isEnable; 
            } 
            else 
            { 
                if (item.HasControls()) 
                    EnableControls(item.Controls, isEnable); 
            }
        }
    }

 public void EnableControls(ControlCollection ctrl, bool isEnable) {
    foreach (Control item in ctrl) {
        if (item.HasControls ())
            EnableControls (item.Controls, isEnable);
        else {
            try
            {
                if (item is WebControl)
                    ((WebControl)item).Enabled = isEnable;
                else if (item is HtmlControl)
                    ((HtmlControl)item).Disabled = !isEnable;
            }
            catch (Exception ex)
            {
                //log exception
            }
        }
    }
}


