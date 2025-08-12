def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count


 def fileCount(path, extension) :
    filesInDir = [f for f in os.listdir(path) if f.endswith(extension)]
    return len([f for f in filesInDir if f.endswith(extension)])


