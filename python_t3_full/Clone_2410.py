def zipdir(path, ziph) :
	for root, dirs, files in os.walk(path) :
		for file in files :
			ziph.write(os.path.join(root, file))


def zipdir(path, ziph):
    for root, dirnames, filenames in os.walk(path):
        for filename in fnmatch.filter(filenames, '*'):
            ziph.write(os.path.join(root, filename))




