def convert(items, ID) :
	for key, value in items.items() :
		for keys, values in ID.items() :
			if keys == key :
				items [key] = values
	return items




def convert(items, ID):
	for itmK, itmV in items.items():
		for idK, idV in ID.items():
			if idK == itmK:
				items[itmK] = idV
	return items

