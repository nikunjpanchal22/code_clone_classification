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
     app.Selection.Find.ClearFormatting();
     app.Selection.Find.Text = (string)findMe;
     if (replaceMe.ToString().Length < 256)
     {
         app.Selection.Find.Execute(ref findMe, ref missing, ref missing, ref missing, ref missing, ref missing,
             ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing);
         app.Selection.Font.ColorIndex = '1';
         app.Selection.Text = (string)replaceMe;
     }
     else
     {
         while (app.Selection.Find.Execute(ref findMe, ref missing, ref missing, ref missing, ref missing, ref missing,
             ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing, ref missing))
         {
             app.Selection.Font.ColorIndex = '1';
             app.Selection.Text = (string)replaceMe;
             app.Selection.Collapse();
         }
     }
}


