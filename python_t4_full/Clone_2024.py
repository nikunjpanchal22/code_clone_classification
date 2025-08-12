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
   for i in range(len(array) -1, -1, -1) :
      if array[i] == value:
         array.pop(i)


