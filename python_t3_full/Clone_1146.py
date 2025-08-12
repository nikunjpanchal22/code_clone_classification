def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size


	
 def get_dir_size(directory_name):
    dir_size = 0
    for (path, dir, files) in os.walk(directory_name):
        for file in files:
            dir_size += os.path.getsize(os.path.join(path, file))


