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
   	for i in os.listdir(directory):
   		files_list.append(i)
   		file_path = os.path.join(directory, i)
   		if os.path.isdir(file_path):
   			files_list.extend(get_file_list(file_path))


