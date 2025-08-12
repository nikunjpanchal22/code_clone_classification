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
  		if os.path.isdir(os.path.abspath(i)):
  			for p, _, j in os.walk(os.path.abspath(i)):
  				for file in j:
  					files_list.append(os.path.abspath(os.path.join(p,file)))
  		elif os.path.isfile(i):
  			files_list.append(i)


