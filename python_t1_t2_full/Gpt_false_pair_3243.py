def folder_size(path) :
	parent = {}
	folder_size = {}
	folder = os.path.realpath(path)
	for root, _, filenames in os.walk(folder) :
		if root == folder :
			parent [root] = - 1
			folder_size [root] = 0.0
		elif root not in parent :
			immediate_parent_path = os.path.dirname(root)
			parent [root] = immediate_parent_path
			folder_size [root] = 0.0
		total_size = 0
		for filename in filenames :
			filepath = os.path.join(root, filename)
			total_size += os.stat(filepath).st_size
		folder_size [root] = total_size
		temp_path = root
		while parent [temp_path] ! = - 1 :
			folder_size [parent [temp_path]] += total_size
			temp_path = parent [temp_path]
	return folder_size [folder] / 1000000.0




def folder_size(path):
    parent = {}
    folder_size = {}
    folder = os.path.realpath(path)
    for root, _, filenames in os.walk(folder):
        if root == folder:
            parent[root] = -1
            folder_size[root] = 0.0
        elif root not in parent:
            immediate_parent_path = os.path.dirname(root)
            parent[root] = immediate_parent_path
            folder_size[root] = 0.0
        total_size = 0
        for filename in filenames:
            filepath = os.path.join(root, filename)
            total_size += os.stat(filepath).st_size
        folder_size[root] = total_size
        temp_path = root
        while temp_path != -1:
            folder_size[parent[temp_path]] += total_size
            temp_path = parent[temp_path]
    return folder_size[folder] / 1000000.0
