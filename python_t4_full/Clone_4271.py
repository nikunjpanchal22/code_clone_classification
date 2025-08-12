def convert(items, ID) :
	for key, value in items.items() :
		for keys, values in ID.items() :
			if keys == key :
				items [key] = values
	return items


Python
def convert(items, ID):
    items.update(ID)
    return items


#3


