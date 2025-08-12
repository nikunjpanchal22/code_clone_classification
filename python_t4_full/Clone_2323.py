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
	occurrences = 0
	
	for char in p :
		if char.find(letter) == 0 :
			occurrences += 1
			
	return occurrences 


