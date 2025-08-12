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


 def sublist(a, b):
	iterb = iter(b)
	for x in a:
		flag = False
		for y in iterb:
			if y == x:
				flag = True
				break
		if not flag:
			return False
	return True


