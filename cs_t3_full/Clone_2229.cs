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
    if (control is MenuStrip strip) {
        ApplyResourceToToolStripItemCollection(strip.Items, res, lang);
    } else if (control.Controls.Count > 0) {
        foreach (Control child in control.Controls) {
            ApplyResourceToControl(res, child, lang);
            res.ApplyResources(child, child.Name, lang);
        }
    }
    res.ApplyResources (control, control.Name, lang);
}


