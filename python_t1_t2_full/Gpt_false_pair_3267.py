def is_sorted(stuff) :
	for i in range(1, len(stuff)) :
		if stuff [i - 1] > stuff [i] :
			return False
	return True




def is_sorted(items):
	for j in range(1, len(items)):
		if items[j-1] > items[j]:
			return False
	return True
