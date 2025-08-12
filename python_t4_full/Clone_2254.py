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


 def get_size(start_path = '.') :
    total_size = 0
    for root, subdirs, files in os.walk(start_path):
        root_file_size = 0
        for f in files:
            try:
                file_stat = os.stat(os.path.join(root, f))
                root_file_size += file_stat.st_size
            except:
                continue
        total_size += root_file_size
    return total_size


