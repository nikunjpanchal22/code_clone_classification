def change_keys(obj) :
	new_obj = obj
	for k in new_obj :
		if hasattr(obj [k], '__getitem__') :
			change_keys(obj [k])
		if '.' in k :
			obj [k.replace('.', '$')] = obj [k]
			del obj [k]


			obj[k.replace('.', '$')] = obj.pop(k)




def change_keys(obj):
	for k in list(obj.keys()):
		if '.' in k:
			val = obj.pop(k)


