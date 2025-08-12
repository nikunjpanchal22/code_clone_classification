def convert(items, ID) :
	for key, value in items.items() :
		for keys, values in ID.items() :
			if keys == key :
				items [key] = values
	return items




def convert(substitutes, original) :
	for key, value in substitutes.items() :
		for keys, values in original.items() :
			if keys == key :
				substitutes[key] = values
	return substitutes
