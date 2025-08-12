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
            if (string.IsNullOrWhiteSpace(file))
            {
                return;
            }

            string[] lines = File.ReadAllLines(file);
            foreach (string line in lines)
            {
                if (!line.StartsWith(";") && !line.StartsWith("#") && !line.StartsWith("'") && line.Contains('='))
                {
                    int index = line.IndexOf('=');
                    string key = line.Substring(0, index).Trim();
                    string value = line.Substring(index + 1).Trim();
                    if (value.StartsWith("\"") && value.EndsWith ("\"") || value.StartsWith ("'") && value.EndsWith ("'"))
                    {
                        string newValue = value.Substring(1, value.Length - 2);
                        list.Add(key, newValue);
                    }
                }
            }
        }

 private void loadFromFile (String file) {
    if (string.IsNullOrEmpty(file))
    {
        throw new ArgumentNullException(nameof(file),"file cannot be null of empty");
    }
           string[] lines = File.ReadAllLines(file); 
            foreach (string line in lines) { 
                if (line.Contains('=') && !line.Trim().StartsWith(";") && !line.Trim().StartsWith("#") && !line.Trim().StartsWith("'")) {
                    int index = line.IndexOf('=');
                    string key = line.Substring(0, index).Trim();
                    string value = line.Substring(index + 1).Trim();

                    if ((value.StartsWith("\"") && value.EndsWith("\"")) || (value.StartsWith("'") && value.EndsWith("'")))
                    {
                        value = value.Substring(1, value.Length - 2);

                        try {
                            list.Add(key,value);
                        }
                        catch (IOException e) {
                            Console.WriteLine("IO Exception Occured");
                        }
                    }
                }
            }
        }

 private void loadFromFile (String file) {

        // Check if the file exists.
        if (File.Exists(file))
        {
            string[] lines = File.ReadAllLines(file);
            foreach (string line in lines)
            {
                if (!String.IsNullOrEmpty(line) &&
                                            !line.StartsWith(";") &&
                                            !line.StartsWith("#") &&
                                            !line.StartsWith("'") &&
                                            line.Contains('='))
                {
                    int index = line.IndexOf('=');
                    String key = line.Substring(0, index).Trim();
                    String value = line.Substring(index + 1).Trim();

                    if ((value.StartsWith("\"") && value.EndsWith("\"")) ||
                        (value.StartsWith("'") && value.EndsWith("'")))
                    {
                        value = value.Substring(1, value.Length - 2);
                        try
                        {

                            list.Add(key, value);
                        }
                        catch (Exception ex)
                        {
                            // Exception catch.
                        }
                    }
                }
            }
        }
    }

 private void loadFromFile (String file) 
    { 

        // Sanity check for file
        if (string.IsNullOrWhiteSpace(file))
            return;

        if (!File.Exists(file))
            return;

        // Read all lines from file
        string[] lines = File.ReadAllLines(file);

        // Iterate through lines
        foreach (string line in lines)
        {
            // Only process lines containing "=" 
            if (line.Contains('=') && 
                !line.Trim().StartsWith(";") && 
                !line.Trim().StartsWith("#") && 
                !line.Trim().StartsWith("'"))
            {
                int index = line.IndexOf('=');
                string key = line.Substring(0, index).Trim();
                string value = line.Substring(index + 1).Trim();

                if ((value.StartsWith("\"") && value.EndsWith("\"")) || (value.StartsWith("'") && value.EndsWith("'")))
                {
                    value = value.Substring(1, value.Length - 2);
                    try
                    {
                        list.Add(key, value);
                    }
                    catch 
                    {
                        // Exception Catch
                    }
                }
            }
        }
    }

 private void loadFromFile (String file) 
{

    if (string.IsNullOrWhiteSpace(file))
    {
        // Return exception
        return;
    }

    if (!File.Exists(file))
    {
        // Return exception
        return;
    }

    string[] lines = File.ReadAllLines(file);

    foreach (string line in lines)
    {
        // Continue if line is not empty or null and doesn't starts with ";", "#", or "'"
        if (line != null && line != string.Empty && !line.StartsWith(';') && !line.StartsWith('#') && !line.StartsWith('\''))
        {
            // Check if line contains "="
            if (line.Contains('='))
            {
                // Get index of "="
                int index = line.IndexOf('=');

                // Store key and value
                string key = line.Substring(0, index).Trim();
                string value = line.Substring(index + 1).Trim();

                // Check if value starts and ends with " or '
                if (value.StartsWith('"') && value.EndsWith('"') || value.StartsWith('\'') && value.EndsWith('\''))
                {
                    // Get new value
                    string newValue = value.Substring(1, value.Length - 2);

                    // Add key and value to list
                    try {
                        list.Add(key, newValue);
                    }               
                    catch 
                    {
                        // Exception Catch
                    }
                }
            }
        }
    }
}


