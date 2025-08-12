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
   index = -1

   for element in a: 
        index1 = b.find(element, index + 1) 

        if index1 == -1:
            return False 
        index = index1 

   return True


