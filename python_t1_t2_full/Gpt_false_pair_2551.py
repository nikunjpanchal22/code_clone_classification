def purge(dir, pattern) :
	for f in os.listdir(dir) :
		if re.search(pattern, f) :
			os.remove(os.path.join(dir, f))




def purge(directory, match_string) :
	for filename in os.listdir(directory) :
		if re.search(match_string, filename) :
			os.remove(os.path.join(directory, filename))

