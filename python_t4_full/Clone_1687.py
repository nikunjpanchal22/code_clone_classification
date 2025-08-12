def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size


#gpt output=============
 def get_dir_size(root):
    total_size = 0
    for item in os.listdir(root):
        itempath = os.path.join(root, item)
        if os.path.isfile(itempath):
            total_size += os.path.getsize(itempath)
        elif os.path.isdir(itempath):
            total_size += get_dir_size(itempath)


