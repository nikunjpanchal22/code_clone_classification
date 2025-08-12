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



private void loadFromFile(string filePath)
{
    var lines = File.ReadAllLines(filePath);
    var parsedData = new Dictionary<string, string>();
    foreach (var line in lines)
    {
        if (string.IsNullOrEmpty(line) || line.StartsWith(";") || line.StartsWith("#") || line.StartsWith("'")||!line.Contains('=')) continue;
        var splitLine = line.Split('=');
        var key = splitLine[0].Trim();
        var value = splitLine[1].Trim();
        if ((value.StartsWith("\"") && value.EndsWith("\"")) || (value.StartsWith("'") && value.EndsWith("'"))) value = value.Substring(1, value.Length - 2);
        try { parsedData.Add(key, value); } catch { }
    }
}


