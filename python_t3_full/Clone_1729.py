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
	in_b = iter(b)
	for x in a:
		try:
			while next(in_b) != x:
				pass
			else:
				return True
		except StopIteration: 
			return False


