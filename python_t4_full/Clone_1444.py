def is_member(x) :
	a = [1, 5, 3, 9, 4, 100]
	for i in a :
		if i == x :
			return "True"
	return "False"


 def is_member(x):
   if any(x == item for item in [1, 5, 3, 9, 4, 100]):
      return True
   return False


