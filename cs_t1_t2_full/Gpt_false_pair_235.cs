public static void ReplaceTextInWordDoc (Object findMe, Object replaceMe, ApplicationClass app) {
    object replaceAll = Word.WdReplace.wdReplaceAll;
    object missing = System.Reflection.Missing.Value;
    app.Application.Selection.Find.ClearFormatting ();
    app.Application.Selection.Find.Text = (string) findMe;
    app.Application.Selection.Find.Replacement.ClearFormatting ();
    if (replaceMe.ToString ().Length < 256) {
        app.Application.Selection.Find.Replacement.Text = (string) replaceMe;
        app.Application.Selection.Find.Execute (ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref replaceAll, ref missing, ref missing, ref missing, ref missing);
    } else {
        while (app.Application.Selection.Find.Execute (ref findMe, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing)) {
            app.Application.Selection.Text = (string) replaceMe;
            app.Application.Selection.Collapse ();
        }
    }
}


 public static void ReplaceTextInWordDoc (Object findMe, Object replaceMe, ApplicationClass app) 
{
    object missing = System.Reflection.Missing.Value;
    object replaceAll = Word.WdReplace.wdReplaceAll;
    app.Application.Selection.Find.ClearFormatting();
    app.Application.Selection.Find.Text = (string)findMe;
    app.Application.Selection.Find.Replacement.ClearFormatting();
    int len = replaceMe.ToString().Length;

    // If the length of the replacement is less than 256 characters
    // execute with wdReplaceAll.
    if (len < 256)
    {
        app.Application.Selection.Find.Replacement.Text = (string)replaceMe;
        app.Application.Selection.Find.Execute(ref missing, ref missing, ref missing, ref missing, ref missing,
            ref missing, ref missing, ref missing, ref missing, ref missing, ref replaceAll, ref missing,
            ref missing, ref missing, ref missing);
    }
    else // Otherwise, execute and loop while the search string is found.
    {
        while (app.Application.Selection.Find.Execute(ref findMe, ref missing, ref missing, ref missing, ref missing,
            ref missing, ref missing, ref missing, ref missing, ref missing, ref replaceAll, ref missing,
            ref missing, ref missing, ref missing))
        {
            app.Application.Selection.Text = (string)replaceMe;
            app.Application.Selection.Collapse();
        }
    }
}
