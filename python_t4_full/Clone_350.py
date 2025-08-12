def is_sorted(stuff) :
	for i in range(1, len(stuff)) :
		if stuff [i - 1] > stuff [i] :
			return False
	return True


def is_sorted(stuff):
    for i in range(len(stuff)-1):
        if stuff[i] > stuff[i+1]: 
            return False 
        else: 
            continue
    return True



