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
	letter_position = 0
	
	while letter_position < len(letter) :
		for char in p :
			if char[letter_position] == letter[letter_position] :
				occurrences += 1
		letter_position += 1
		
	return occurrences


