def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count


 def fileCount(path, extension) :
    for root, dirs, files in os.walk(path) :
        files = [file for file in files if file.endswith(extension)]
        count = len(files)
    return count


