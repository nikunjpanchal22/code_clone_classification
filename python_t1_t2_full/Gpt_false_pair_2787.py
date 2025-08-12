def zipdir(path, ziph) :
	for root, dirs, files in os.walk(path) :
		for file in files :
			ziph.write(os.path.join(root, file))




def zipdir(filepath, compress) :
	for directory, sub_dirs, files in os.walk(filepath) :
		for name in files :
			compress.write(os.path.join(directory, name))
