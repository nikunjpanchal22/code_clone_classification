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


            fp = os.path.join(path, name)
            if os.path.isfile(fp):
                size = os.stat(fp).st_size
                total_size += size
    return total_size




def get_dir_size(start_path='.'):
    total_size = 0
    for path, _, files in os.walk(start_path):
        for name in files:
            fp = os.path.join(path, name)


