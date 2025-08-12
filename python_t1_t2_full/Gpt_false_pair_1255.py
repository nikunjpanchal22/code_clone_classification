def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size



 def get_dir_size(directory):
 	total_size = 0
	for dirName, subdirList, fileList in os.walk(directory):
		for fileName in fileList:
			total_size += os.path.getsize(os.path.join(dirName, fileName))
