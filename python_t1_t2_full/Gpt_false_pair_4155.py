def change_keys(obj) :
	new_obj = obj
	for k in new_obj :
		if hasattr(obj [k], '__getitem__') :
			change_keys(obj [k])
		if '.' in k :
			obj [k.replace('.', '$')] = obj [k]
			del obj [k]




def remap_keys(dictionary):
	new_dict = dictionary
	for item in new_dict:
		if hasattr(dictionary[item], '__getitem__'):
			remap_keys(dictionary[item])
		if '_' in item:
			dictionary[item.replace('_', '$')] = dictionary[item]
			del dictionary[item]
