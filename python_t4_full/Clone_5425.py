def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count



import os

def fileCount(path, extension):
    count = sum(1 for root, dirs, files in os.walk(path)
                for f in files if f.endswith(extension))
    return count



