def is_sorted(stuff) :
	for i in range(1, len(stuff)) :
		if stuff [i - 1] > stuff [i] :
			return False
	return True




def is_sorted(objects):
	for i in range(1, len(objects)):
		if objects[i-1] > objects[i]:
			return False
	return True 

