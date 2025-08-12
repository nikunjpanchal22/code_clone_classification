def ignore_until(the_list, match) :
	if match in the_list :
		index = the_list.index(match)
		return the_list [index :]
	else :
		return []




def skip_past(the_items, symbol) :
	if symbol in the_items :
		index = the_items.index(symbol)
		return the_items [index :]
	else :
		return []
