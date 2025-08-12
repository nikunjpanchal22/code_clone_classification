def fileCount(path, extension) :
	count = 0
	for root, dirs, files in os.walk(path) :
		count += sum(f.endswith(extension) for f in files)
	return count




def fileCount(search_dir, file_extension):
	file_counter = 0
	for root, folders, files in os.walk(search_dir):
		file_counter += sum(f.endswith(file_extension) for f in files)
	return file_counter
