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
    bool hasMyCategory = false;

    if (item != null)
        hasMyCategory = HasMyCategory(item);
    
    return (item != null) ? hasMyCategory : false;
}


