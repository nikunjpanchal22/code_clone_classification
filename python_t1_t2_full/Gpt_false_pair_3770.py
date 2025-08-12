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




def remove_element(value, array) :
	num_shifts = 0
	for kindex in xrange(len(array)) :
		try :
			array[kindex] = array[kindex + num_shifts]
			while array[kindex] == value :
				num_shifts += 1
				array[kindex] = array[kindex + num_shifts]
		except IndexError :
			array[kindex] = None
