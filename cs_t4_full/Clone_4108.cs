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


 public static void ReplaceTextInWordDoc (Object findMe, Object replaceMe, ApplicationClass app) {
    var range = app.Application.ActiveDocument.Content;
     range.Find.ClearFormatting();
     range.Find.Text = (String)findMe;
     range.Find.Replacement.ClearFormatting();
     range.Find.Replacement.Text = (String)replaceMe;
     range.Find.Execute(Replace:WdReplace.wdReplaceAll);
    }

 public static void ReplaceTextInWordDoc (Object findMe, Object replaceMe, ApplicationClass app) {
     foreach (Microsoft.Office.Interop.Word.Bookmark wordBookmark in app.Application.ActiveDocument.Bookmarks)
     {
          if (wordBookmark.Name == findMe.ToString())
          {
               wordBookmark.Range.Text = (String)replaceMe;
          }
     }
}


