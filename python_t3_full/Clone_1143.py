def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size



 def get_dir_size(path):
    total_size = 0
    for root, dirs, files in os.walk(path):
        for name in files:
            absolute_path = os.path.join(root, name)
            total_size += os.path.getsize(absolute_path)


