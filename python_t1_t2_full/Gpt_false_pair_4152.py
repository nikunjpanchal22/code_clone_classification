def change_keys(obj) :
	new_obj = obj
	for k in new_obj :
		if hasattr(obj [k], '__getitem__') :
			change_keys(obj [k])
		if '.' in k :
			obj [k.replace('.', '$')] = obj [k]
			del obj [k]




def change_keys(obj) :
	copied_obj = obj
	for key in copied_obj:
		if hasattr(copied_obj [key], '__getitem__') :
			change_keys(copied_obj [key])
		if '_' in key :
			copied_obj [key.replace('_', '$')] = copied_obj [key]
			del copied_obj [key]
			
