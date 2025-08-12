def purge(dir, pattern) :
	for f in os.listdir(dir) :
		if re.search(pattern, f) :
			os.remove(os.path.join(dir, f))




def remove(dir, pattern):
	for f in os.listdir(dir):
		if re.search(pattern, f):
			os.remove(os.path.join(dir, f))
