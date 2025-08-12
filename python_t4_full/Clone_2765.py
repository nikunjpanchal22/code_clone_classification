def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)


 def length_of_string(mystring):
   if type(mystring) == int :
       return "invalid entry"
   else:
       words = 0
       for letter in mystring:
           words = words + 1
       return words


