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




def get_size(start_path = '.'):
	running_total = 0
	already_observed = {}
	for directory_path, directories, filenames in os.walk(start_path):
		for f in filenames:
			path = os.path.join(directory_path, f)
			try:
				stats = os.stat(path)
			except OSError:
				continue
			try:
				already_observed[stats.st_ino]
			except KeyError:
				already_observed[stats.st_ino] = True
			else:
				continue
			running_total += stats.st_size
	return running_total
