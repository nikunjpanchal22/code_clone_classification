def convert(items, ID) :
	for key, value in items.items() :
		for keys, values in ID.items() :
			if keys == key :
				items [key] = values
	return items


  def convert(items, ID) :
        new_items = {}
        for key, val in items.items():
            if key in ID:
                new_items[key] = ID[key]
        return new_items


