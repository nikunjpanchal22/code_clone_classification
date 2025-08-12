def convert(items, ID) :
	for key, value in items.items() :
		for keys, values in ID.items() :
			if keys == key :
				items [key] = values
	return items




def convert(items, ID):
	for key, value in items.items():
		for k, v in ID.items():
			if k == key:
				items[key] = v
	return items

