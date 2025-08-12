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
    for root, subdirs, files in os.walk(directory):
        for file in files:
            file_path = os.path.join(directory, file)
            if os.path.isdir(file_path):
                files_list.extend(get_file_list(file_path))
            else:
                files_list.append(file_path)


