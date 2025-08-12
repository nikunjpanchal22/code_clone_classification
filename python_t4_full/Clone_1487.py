def convert(items, ID) :
	for key, value in items.items() :
		for keys, values in ID.items() :
			if keys == key :
				items [key] = values
	return items


  def convert(items, ID) :
        for data in items.items():
            if data[0] in ID:
                items[data[0]] = ID[data[0]]
        return items


