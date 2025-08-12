def convert(items, ID) :
	for key, value in items.items() :
		for keys, values in ID.items() :
			if keys == key :
				items [key] = values
	return items


  def convert(items, ID) :
        for item in items:
            if item in ID:
                items[item] = ID[item]
        return items


