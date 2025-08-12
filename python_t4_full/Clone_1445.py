def is_member(x) :
	a = [1, 5, 3, 9, 4, 100]
	for i in a :
		if i == x :
			return "True"
	return "False"


 def is_member(x):
   b = [1, 5, 3, 9, 4, 100]
   return any(el == x for el in b)


