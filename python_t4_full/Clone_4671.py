def change_keys(obj) :
	new_obj = obj
	for k in new_obj :
		if hasattr(obj [k], '__getitem__') :
			change_keys(obj [k])
		if '.' in k :
			obj [k.replace('.', '$')] = obj [k]
			del obj [k]




def change_keys(obj):
    new_obj = {}
    for k, v in obj.items():
        if isinstance(v, dict):
            v = change_keys(v)
        if '.' in k:
            new_obj[k.replace('.', '$')] = v
        else:
            new_obj[k] = v


