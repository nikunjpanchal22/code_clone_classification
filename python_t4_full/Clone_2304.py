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
	if not p:
		return 0
	elif p[0][0] == letter:
		return 1 + count_occurrences(p[1:], letter)
	else:
		return count_occurrences(p[1:], letter)


