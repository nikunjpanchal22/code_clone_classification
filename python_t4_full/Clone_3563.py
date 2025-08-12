def purge(dir, pattern) :
	for f in os.listdir(dir) :
		if re.search(pattern, f) :
			os.remove(os.path.join(dir, f))


def purge(dir, pattern):
    for f in os.scandir(dir):
        if f.is_file():
            if re.search(pattern, f.name):
                os.remove(f.path)




