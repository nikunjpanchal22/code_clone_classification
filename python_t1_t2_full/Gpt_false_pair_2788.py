def zipdir(path, ziph) :
	for root, dirs, files in os.walk(path) :
		for file in files :
			ziph.write(os.path.join(root, file))




def zipdir(folder, arch) :
	for parent, dirs, files in os.walk(folder) :
		for singleFile in files :
			arch.write(os.path.join(parent, singleFile))

