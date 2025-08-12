def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count


 def fileCount(path, extension) :
    count = 0
    for root, dirs, files in os.walk(path) :
        for file in files :
            if file.rsplit('.', 1)[-1] == extension :
                count += 1
    return count


