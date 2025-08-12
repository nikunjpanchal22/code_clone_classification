def get_file_list(directory = '.') :
	files = []
	for i in os.listdir(directory) :
		if os.path.isdir(i) :
			files.extend(get_file_list(i))
		else :
			files.append(i)
	return files


#gpt output=============
  def get_file_list(directory = '.'):
  	files = os.listdir(directory)
  	files_list = []
  	for file in files:
  		full_name = os.path.join(directory, file)
  		if os.path.isdir(full_name):
  			files_list.extend(get_file_list(full_name))
  		else:
  			files_list.append(full_name)


