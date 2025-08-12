def count_occurrences(p, letter) :
	count = 0
	for elem in p :
		try :
			if elem [0] == letter :
				count = count + 1
		except Exception as ex :
			print (ex.message)
	return count


 def count_occurrences(p, letter) :
	count = 0
	for t in p :
		if t[0] == letter or t.startswith(letter) :
			count = count + 1
	return count 


