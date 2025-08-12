def get_size(start_path = '.') :
	total_size = 0
	seen = {}
	for dirpath, dirnames, filenames in os.walk(start_path) :
		for f in filenames :
			fp = os.path.join(dirpath, f)
			try :
				stat = os.stat(fp)
			except OSError :
				continue
			try :
				seen [stat.st_ino]
			except KeyError :
				seen [stat.st_ino] = True
			else :
				continue
			total_size += stat.st_size
	return total_size




def get_folder_size(start_path = '.'):
    total_size = 0
    seen_files = {}
    for root, dirs, files in os.walk(start_path):
        for file in files:
            file_path = os.path.join(root, file)
            if os.path.isfile(file_path):
                if not file_path in seen_files:
                    total_size += os.path.getsize(file_path)
                    seen_files[file_path] = True
    return total_size




