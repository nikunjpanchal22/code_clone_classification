def sublist(a, b) :
	i = - 1
	try :
		for e in a :
			i = b.index(e, i + 1)
	except ValueError :
		return False
	else :
		return True


 def sublist(a, b):
   if a==[]: 
      return True
   if b==[]: 
      return False
   if a[0] in b:
      return sublist(a[1:],b[b.index(a[0]):])
   return False


