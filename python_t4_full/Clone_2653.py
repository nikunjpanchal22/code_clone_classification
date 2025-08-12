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
	i_b = iter(b)
	for x in a:
		flag = False
		while True:
			try: 
				y = next(i_b)
				if y == x:
					flag = True
					break
			except StopIteration:
				break
		if not flag:
			return False
	return True



