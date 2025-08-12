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
    seen_subtrees = []
    total_size = 0
    def walk_subtrees(path):
        if path in seen_subtrees:
            return
        seen_subtrees.append(path)
        for root, _, files in os.walk(path):
            for file in files:
                try:
                    total_size += os.stat(os.path.join(root, file)).st_size
                except OSError:
                    continue
    walk_subtrees(start_path)
    return total_size


