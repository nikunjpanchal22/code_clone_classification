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
	i = 0
	while i < len(b):
		if b[i] == a[0]:
			match = True
			for j in range(len(a)):
				if a[j] != b[i+j]:
					match = False
					break
			if match:
				return True
		i += 1
	return False


