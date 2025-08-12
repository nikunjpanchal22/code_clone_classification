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
  	for (dir, dirname, filenames) in os.walk(directory):
  		files_list.extend([os.path.join(dir, filename) for filename in filenames])
  	return files_list



