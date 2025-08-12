def change_keys(obj) :
	new_obj = obj
	for k in new_obj :
		if hasattr(obj [k], '__getitem__') :
			change_keys(obj [k])
		if '.' in k :
			obj [k.replace('.', '$')] = obj [k]
			del obj [k]




def change_keys(dict_): 
    copy_dict = dict_ 
    for k in copy_dict: 
        if hasattr(copy_dict[k], '__getitem__'): 
            change_keys(copy_dict[k]) 
        if '-' in k: 
            copy_dict[k.replace('-', '$')] = copy_dict[k] 
            del copy_dict[k]
