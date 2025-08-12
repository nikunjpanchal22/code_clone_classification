def change_keys(obj) :
	new_obj = obj
	for k in new_obj :
		if hasattr(obj [k], '__getitem__') :
			change_keys(obj [k])
		if '.' in k :
			obj [k.replace('.', '$')] = obj [k]
			del obj [k]





def change_keys(obj):
	if not isinstance(obj, dict):
		return
	for k in list(obj.keys()):
		if '.' in k:
			obj[k.replace('.', '$')] = obj.pop(k)


