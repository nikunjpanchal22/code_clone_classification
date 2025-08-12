def is_sorted(stuff) :
	for i in range(1, len(stuff)) :
		if stuff [i - 1] > stuff [i] :
			return False
	return True


def is_sorted(stuff):
    n = len(stuff)
    flag = False
    for i in range(n-1):
        if stuff[i] <= stuff[i+1]:
            flag = True
        else:
            flag = False
            break
    return flag



