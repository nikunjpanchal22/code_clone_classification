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





private void loadFromFile(string filename) {
    string line, key, value;
    using (StreamReader sr = new StreamReader(filename)) {
        while ((line = sr.ReadLine()) != null) {
            if (!line.Trim().StartsWith("#") && !line.Trim().StartsWith("';") && !line.Trim().StartsWith("'") && line.Trim().Contains("=")) {
                string[] parts = line.Split('=');
                key = parts[0].Trim(); value = parts[1].Trim();
                if(!list.ContainsKey(key)) { list.Add(key,value); }
            }
        }
    }
}


