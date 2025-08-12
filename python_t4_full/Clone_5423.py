def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count



def fileCount(path, extension):
    extension = "." + extension
    return len([f for _, _, files in os.walk(path) for f in files if f.endswith(extension)])




def fileCount(path, extension):
    count = 0


