def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size


	
 def get_dir_size(root):
	total_size = 0
	for (path, dirs, files) in os.walk(root):
		for f in files:
			 size = os.path.getsize(os.path.join(path,f))
			 total_size += size
			 


