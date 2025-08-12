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
   i = 0 
   while i < len(array):
        if array[i] == value:
           array.remove(value)
        else:
            i += 1


