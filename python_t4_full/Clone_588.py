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
  			files_list.append(os.path.join(directory, file))
  	return files_list



