def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size


	
 def get_dir_size(directory):
	total = 0
	for root, _, files in os.walk(directory):
		for file_name in files:
			file_path = os.path.join(root, file_name)
			total += os.path.getsize(file_path)


