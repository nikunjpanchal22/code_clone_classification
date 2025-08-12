private static void ApplyResourceToControl (ComponentResourceManager res, Control control, CultureInfo lang) {
    if (control.GetType () == typeof (MenuStrip)) {
        MenuStrip strip = (MenuStrip) control;
        ApplyResourceToToolStripItemCollection (strip.Items, res, lang);
    }
    foreach (Control c in control.Controls) {
        ApplyResourceToControl (res, c, lang);
        res.ApplyResources (c, c.Name, lang);
    }
    res.ApplyResources (control, control.Name, lang);
}





private static void ApplyResourceToControl (ComponentResourceManager res, Control control, CultureInfo lang) {
    switch(control) {
        case MenuStrip strip:
            ApplyResourceToToolStripItemCollection(strip.Items, res, lang);
            break;
        default:
            control.Controls.OfType<Control>().ToList().ForEach(c => { 
                ApplyResourceToControl(res, c, lang);
                res.ApplyResources(c, c.Name, lang);
            });
            break;
    }
    res.ApplyResources (control, control.Name, lang);
}


