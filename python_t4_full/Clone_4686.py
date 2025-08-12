def remove_element(value, array) :
	shift = 0
	for index in xrange(len(array)) :
		try :
			array [index] = array [index + shift]
			while array [index] == value :
				shift += 1
				array [index] = array [index + shift]
		except IndexError :
			array [index] = None


def remove_element(value, arr):
    new_arr = []
    for i in arr:
        if i != value:
            new_arr.append(i)
    return new_arr


 



