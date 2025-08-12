def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count


  def fileCount(path, extension):
    counter = 0
    for file in os.listdir(path):
        if file.endswith(extension):
            counter += 1
    return counter


