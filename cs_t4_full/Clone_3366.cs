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
    if (control is MenuStrip ms)
        ApplyResourceToControlCollection(ms.Items, res, lang);

    control.Controls.Cast<Control>()
        .ToList()
        .ForEach(c => ApplyResourceToControl(res, c, lang));
        
    res.ApplyResources (control, control.Name, lang);
}


