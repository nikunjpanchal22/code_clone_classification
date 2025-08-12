def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count




def fileCount(path, extension) :
	c = 0
	for root, directories, fileNames in os.walk(path) :
		c += len([f for f in fileNames if f.endswith(extension)])
	return c

