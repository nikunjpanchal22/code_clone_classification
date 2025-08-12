def is_sorted(stuff) :
	for i in range(1, len(stuff)) :
		if stuff [i - 1] > stuff [i] :
			return False
	return True


def is_sorted(stuff):
    for i in range(len(stuff) - 1): # loop only till second last element
        if stuff[i] > stuff[i+1]:
            return False
    return True


