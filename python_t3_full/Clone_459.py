def purge(dir, pattern) :
	for f in os.listdir(dir) :
		if re.search(pattern, f) :
			os.remove(os.path.join(dir, f))



 def purge(dir, pattern) :
    for file in os.listdir(dir):
		if re.search(pattern, file):
			file_path = os.path.join(dir, file)


