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





private void loadFromFile (String file)
{
    foreach (var line in File.ReadAllLines(file).Where(l => !string.IsNullOrWhiteSpace(l) 
                                                            && !l.StartsWith("#") 
                                                            && !l.StartsWith(";") 
                                                            && !l.StartsWith("'")))
    {
        var index = line.IndexOf('=');
        if (index <= 0) continue;
        var key = line.Substring(0, index).Trim();
        var value = line.Substring(index + 1).Trim();
        if ((value.StartsWith("\"") && value.EndsWith("\"")) || 
            (value.StartsWith("'") && value.EndsWith("'")))
        {
            value = value.Substring(1, value.Length - 2);
        }   
        try { list.Add(key, value); } catch { }
    }    
}


