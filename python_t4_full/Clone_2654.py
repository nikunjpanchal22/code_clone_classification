def sublist(a, b) :
	seq = iter(b)
	try :
		for x in a :
			while next(seq) ! = x : pass
		else :
			return True
	except StopIteration :
		pass
	return False


 def sublist(a, b) :
	iterb = iter(b)
	for x in a:
		found = False
		while True:
			try: 
				y = next(iterb)
				if y == x:
					found = True
					break
			except StopIteration:
				break
		if not found:
			return False
	return True


