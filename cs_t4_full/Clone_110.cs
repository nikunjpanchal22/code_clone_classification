public bool btnRemoveCategory_IsVisible (Office.IRibbonControl ctl) {
    var item = ctl.Context as Inspector;
    var mailItem = item.CurrentItem as MailItem;
    if (item != null)
        return (item != null && HasMyCategory (item));
    else
        return false;
}


 public bool btnRemoveCategory_IsVisible (Office.IRibbonControl ctl) {
    var item = ctl.Context as Inspector;
    var mailItem = item.CurrentItem as MailItem;
    bool isVisible = false;

    if (mailItem != null) {
        if (HasMyCategory(mailItem))
            isVisible = true;
    }
    
    return isVisible;
}


