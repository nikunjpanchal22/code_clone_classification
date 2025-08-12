def change_keys(obj) :
	new_obj = obj
	for k in new_obj :
		if hasattr(obj [k], '__getitem__') :
			change_keys(obj [k])
		if '.' in k :
			obj [k.replace('.', '$')] = obj [k]
			del obj [k]




def change_keys(obj):
  new_obj = obj
  for key in new_obj:
    if hasattr(obj[key], '__getitem__'):
      change_keys(obj[key])
    if '^' in key:
      obj[key.replace('^', '$')] = obj[key]
      del obj[key]
 
