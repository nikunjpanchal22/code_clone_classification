def is_sorted(stuff) :
	for i in range(1, len(stuff)) :
		if stuff [i - 1] > stuff [i] :
			return False
	return True


def is_sorted(stuff): 
    new_list = [x for x in stuff] 
    all_equal = True
    new_list.sort()
    for index, item in enumerate(stuff):
        if item != new_list[index]:
            all_equal = False
            break
    return all_equal
	


