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
    B_len = len(b)
    A_len = len(a)
    count = 0
    for num in range(B_len-A_len+1):
        if b[num] == a[count]:
            count += 1
        else:
            count = 0
        if count == A_len:
            return True
    return False


