def is_sorted(stuff) :
	for i in range(1, len(stuff)) :
		if stuff [i - 1] > stuff [i] :
			return False
	return True


def is_sorted(stuff): 
    sorted_arr = sorted(stuff) 
    for num in range(len(stuff)): 
        if stuff[num] != sorted_arr[num]: 
            return False
    return True 
	


