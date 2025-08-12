def get_file_list(directory = '.') :
	files = []
	for i in os.listdir(directory) :
		if os.path.isdir(i) :
			files.extend(get_file_list(i))
		else :
			files.append(i)
	return files



def get_file_list(directory = '.'):
        files_list = []
        for (dirpath, dirnames, filenames) in walk(directory):
            for file in filenames:
                files_list.append(os.path.join(dirpath, file))


