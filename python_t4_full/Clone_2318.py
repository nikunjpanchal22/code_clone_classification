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
	letter_check = False

	for i in range(len(p)):
		if p[i][0] == letter:
			count += 1
			letter_check = True
		
	if not letter_check :
		raise ValueError("letter not found in list")
			
	return count


