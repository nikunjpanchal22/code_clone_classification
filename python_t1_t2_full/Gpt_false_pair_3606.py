def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size




def get_directory_size(root_dir):
	size = 0
	for root_dir_path, directory_names, file_names in os.walk(root_dir):
		for file_name in file_names:
			size += os.path.getsize(os.path.join(root_dir_path, file_name))
	return size
