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



  private void loadFromFile (String file) {
           StringBuilder lineData = new StringBuilder();
            using (FileStream fs = new FileStream(file, FileMode.OpenOrCreate, FileAccess.ReadWrite))
            { 
                StreamReader reader = new StreamReader(fs);
                while (!reader.EndOfStream)
                {
                    lineData.AppendLine(reader.ReadLine());
                }

                bool check;
                string[] keyValue = lineData.ToString().Split(';');
                foreach (string keyValueData in keyValue)
                {

                    if (!string.IsNullOrEmpty(keyValueData))
                    {
                        
                        if (keyValueData.Contains('='))
                        {
                            var keyandValue = keyValueData.Split('=');
                            if (keyandValue[1].Trim().StartsWith("'") && keyandValue[1].Trim().EndsWith("'"))
                            {
                                check = true;
                            }
                            else if (keyandValue[1].Trim().StartsWith("\"") && keyandValue[1].Trim().EndsWith("\""))
                            {
                                check = true;
                            }
                            else
                            {
                                check = false;
                            }


                            if (check == true)
                            {
                                string newValue = keyandValue[1].Trim().Substring(1, keyandValue[1].Trim().Length - 2);
                                try
                                {
                                    list.Add(keyandValue[0], newValue);
                                }
                                catch
                                {
                                }
                            }
                        }
                    }
                }
            }
        }

  private void loadFromFile (String file)
        {
            if (!string.IsNullOrEmpty(file))
            {
                string[] lines = File.ReadAllLines(file);

                for (int i = 0; i < lines.Length; i++)
                {
                    if (lines[i].Contains('=') && !lines[i].StartsWith(";") && !lines[i].StartsWith("#") && !lines[i].StartsWith("'"))
                    {
                        int index = lines[i].IndexOf('=');
                        string key = lines[i].Substring(0, index).Trim();
                        string value = lines[i].Substring(index + 1).Trim();

                        if ((value.StartsWith("\"") && value.EndsWith("\"")) || (value.StartsWith("'") && value.EndsWith("'")))
                        {
                            value = value.Substring(1, value.Length - 2);
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
            }
        }
        
 private void loadFromFile (String file)
        {
            if (!File.Exists(file))
            {
                return;
            }

            string[] linesArray = File.ReadAllLines(file);
            List<string> linesList = linesArray.Where(x => !string.IsNullOrWhiteSpace(x)).ToList();

            foreach (string line in linesList)
            {
                if (line.Contains('='))
                {
                    int index = line.IndexOf('=');
                    string key = line.Substring(0, index).Trim();
                    string value = line.Substring(index + 1).Trim();

                    if ((value.StartsWith("\"") && value.EndsWith("\"")) || (value.StartsWith("'") && value.EndsWith("'")))
                    {
                        value = value.Substring(1, value.Length - 2);
                        list.Add(key, value);
                    }
                }
            }
        }
        
 private void loadFromFile (String file) {
		if (!string.IsNullOrEmpty(file) && File.Exists(file)) {
			List<string> lines = File.ReadLines(file).Cast<string>().ToList();
			
			foreach (string line in lines) {
				if (line.Contains('=') && !line.Trim().StartsWith(";") && !line.Trim().StartsWith("#") && !line.Trim().StartsWith("'")) {
					int index = line.IndexOf('=');
					string key = line.Substring(0, index).Trim();
					string value = line.Substring(index + 1).Trim();
					
					if ((value.StartsWith("\"") && value.EndsWith("\"")) || (value.StartsWith("'") && value.EndsWith("'"))) {
						value = value.Substring(1, value.Length - 2);
						list.Add(key, value);
					}
				}
			}
		}
	}
	
	
 private void loadFromFile (String file) {
    if (!string.IsNullOrEmpty(file)) {
        string[] lines = File.ReadAllLines(file);
        foreach (string line in lines) {
            if (line.Contains('=') && !line.Trim().StartsWith(";") && !line.Trim().StartsWith("#") && !line.Trim().StartsWith("'")) {
                int index = line.IndexOf('=');
                string key = line.Substring(0, index).Trim();
                string value = line.Substring(index + 1).Trim();
                if (value.StartsWith("\"") && value.EndsWith("\"") || value.StartsWith("'") && value.EndsWith("'")) {
                    value = value.Substring(1, value.Length - 2);

                    try {
                        list.Add(key, value);
                    } catch (Exception e) {

                    }
                } 
            }
        }
    }
}


