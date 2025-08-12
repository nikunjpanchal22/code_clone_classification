def get_file_list(directory = '.') :
	files = []
	for i in os.listdir(directory) :
		if os.path.isdir(i) :
			files.extend(get_file_list(i))
		else :
			files.append(i)
	return files




def get_file_list(directory = '.') :
    files = []
    for i in os.listdir(directory) :
        if os.path.isdir(i) :
            sub_dir = os.path.join(directory, i)
            files.extend(get_file_list(sub_dir))
        else :
            files.append(os.path.join(directory, i))
    return files
