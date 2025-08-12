def purge(dir, pattern) :
	for f in os.listdir(dir) :
		if re.search(pattern, f) :
			os.remove(os.path.join(dir, f))




def purge(dir_name, string) :
	for item in os.listdir(dir_name) :
		if re.search(string, item) :
			os.remove(os.path.join(dir_name, item))
