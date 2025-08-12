private void loadFromFile (String file) {
    foreach (String line in System.IO.File.ReadAllLines (file)) {
        if ((! String.IsNullOrEmpty (line)) && (! line.StartsWith (";")) && (! line.StartsWith ("#")) && (! line.StartsWith ("'")) && (line.Contains ('='))) {
            int index = line.IndexOf ('=');
            String key = line.Substring (0, index).Trim ();
            String value = line.Substring (index + 1).Trim ();
            if ((value.StartsWith ("\"") && value.EndsWith ("\"")) || (value.StartsWith ("'") && value.EndsWith ("'"))) {
                value = value.Substring (1, value.Length - 2);
            }
            try {
                list.Add (key, value);
            }
            catch {
            }
        }
    }
}





private void loadFromFile(String file) 
{
    foreach (var line in File.ReadLines(file).Where(l => !String.IsNullOrEmpty(l) && l.Contains("=") && !l.StartsWith("#") && !l.StartsWith(";") && !l.StartsWith("'")))
    {
        var index = line.IndexOf('=');
        var key = line.Substring(0, index).Trim();
        var value = line.Substring(index + 1).Trim();
        if (value.Length > 1 && (value.StartsWith("\"") && value.EndsWith("\"")) || (value.StartsWith("'") && value.EndsWith("'")))
            value = value.Substring(1, value.Length - 2);             
        try { list[key] = value; } catch {}
    }   
}


