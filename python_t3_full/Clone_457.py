def get_file_list(directory = '.') :
	files = []
	for i in os.listdir(directory) :
		if os.path.isdir(i) :
			files.extend(get_file_list(i))
		else :
			files.append(i)
	return files



def get_file_list(directory='.'):
    files_list=[]
    for i in os.listdir(directory):
        if os.path.isdir(i):
            files_list.append(os.path.join(i, j) for j in get_file_list(i))
        else:
            files_list.append(i)


