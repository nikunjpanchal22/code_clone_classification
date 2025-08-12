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





private void loadFromFile(string filename)
{
    foreach (var line in File.ReadAllLines(filename)
                             .Where(x => !string.IsNullOrEmpty(x)
                                && !x.StartsWith("#")
                                && !x.StartsWith(";")
                                && !x.StartsWith("'"))
                             .Select(x => x.Split('=')))
    {
        if (line.Length != 2) continue;
        string key = line[0].Trim();
        string value = line[1].Trim().Trim('\"', '\'');
        list.TryAdd(key, value);
    }
}


