def sublist(a, b) :
	seq = iter(b)
	try :
		for x in a :
			while next(seq) != x : pass
		else :
			return True
	except StopIteration :
		pass
	return False


 def sublist(a, b):
	temp = []
	for x in b:
		if x in a:
			temp.append(x)
		if temp == a:
			return True
	return False


