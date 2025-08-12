def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size


	
 def get_dir_size(dir):
	dir_size = 0
	for root, dirs, files in os.walk(dir):
		for name in files:
			filename = os.path.join(root, name)
			dir_size += os.path.getsize(filename)


