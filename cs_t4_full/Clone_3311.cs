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
    File.ReadLines(file)
        .Where(l => !string.IsNullOrWhiteSpace(l))
        .Where(l => !l.StartsWith("#") && !l.StartsWith(";") && !l.StartsWith("'"))
        .Select(l => l.Split(new[] { '=' }, 2))
        .Where(arr => arr.Length == 2)
        .ToList()
        .ForEach(arr =>
        {
            var key = arr[0].Trim();
            var value = arr[1].Trim().Trim('"', '\'');
            try { list.Add(key, value); } catch { }
        });
}


