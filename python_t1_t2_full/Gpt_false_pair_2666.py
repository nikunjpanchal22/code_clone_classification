def count_occurrences(p, letter) :
	count = 0
	for elem in p :
		try :
			if elem [0] == letter :
				count = count + 1
		except Exception, ex :
			print ex.message
	return count




def count_occurrences(p, letter) :
	count = 0
	for elem in p :
		try :
			if elem [0] == letter.capitalize() :
				count = count + 1
		except Exception, ex :
			print ex.message
	return count
