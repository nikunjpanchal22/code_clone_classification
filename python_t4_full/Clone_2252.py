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
    seen = set()
    total_size = 0
    for root, _, files in os.walk(start_path):
        for file in files:
            try:
                stat = os.stat(os.path.join(root, file))
                if stat.st_ino not in seen:
                    seen.add(stat.st_ino)
                    total_size += stat.st_size
            except OSError:
                continue
    return total_size 


