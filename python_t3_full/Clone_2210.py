def get_dir_size(root) :
	size = 0
	for path, dirs, files in os.walk(root) :
		for f in files :
			size += os.path.getsize(os.path.join(path, f))
	return size


    return sum(os.stat(root + '\\' + file).st_size for root, dirs, files in os.walk(root) for file in fnmatch.filter(files, '*.*'))




import os

def get_dir_size(root):
    size = 0
    for foldername, subfolders, filenames in os.walk(root):
        for filename in filenames:
            try:
                size += os.path.getsize(foldername + '/' + filename)


