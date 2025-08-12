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
	size_count = 0
	sttred = {}
	for root, dirs, files in os.walk(start_path):
		for f in files:
			name = os.path.join(root, f)
			try:
				info = os.stat(name)
			except OSError:
				continue
			try:
				sttred[info.st_ino]
			except KeyError:
				sttred[info.st_ino] = True
			else:
				continue
			size_count += info.st_size
	return size_count

