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



private void LoadFileStructure(string fileName)
{
    string[] lines = System.IO.File.ReadAllLines(fileName);
    
    foreach (string line in lines)
    {
        if ((!String.IsNullOrEmpty(line)) &&
            (!line.StartsWith(";")) &&
            (!line.StartsWith("#")) &&
            (!line.StartsWith("'")) &&
            (line.Contains('=')) )
        {
            int index = line.IndexOf('=');
            string key = line.Substring(0, index).Trim();
            string value = line.Substring(index + 1).Trim();
            if (value.StartsWith("\"") && value.EndsWith("\"") ||
                value.StartsWith("'") && value.EndsWith("'"))
            {
                value = value.Substring(1, value.Length - 2);
            }
            try
            {
                list.Add(key, value);
            }
            catch
            {
            }
        }
    }
}


