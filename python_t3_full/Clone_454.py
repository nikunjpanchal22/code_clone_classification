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
	path_names = os.listdir(directory)
	for i in path_names:
		node_name = os.path.join(directory, i)
		if os.path.isdir(node_name):
			files_list.extend(get_file_list(node_name))
		else:
			files_list.append(node_name)


