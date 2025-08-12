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
	shift = 0
	for i in range(len(array)) :
		try :
			array [i] = array [i + shift]
			while array [i] == value :
				shift += 1
				array [i] = array [i + shift]
		except IndexError :
			array [i] = None
