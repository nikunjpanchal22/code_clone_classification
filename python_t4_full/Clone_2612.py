def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a,b):
    source_list = b
    destination_list = []
    for element in a:
        if element in source_list:
            destination_list.append(element)
            source_list = source_list[source_list.index(element)+1:]
        else:
            return False
    return True


