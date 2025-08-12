def convert(items, ID) :
	for key, value in items.items() :
		for keys, values in ID.items() :
			if keys == key :
				items [key] = values
	return items


from collections import Counter
def convert(items, ID) :
    items = Counter(items)
    items.update(ID)
    return dict(items)




