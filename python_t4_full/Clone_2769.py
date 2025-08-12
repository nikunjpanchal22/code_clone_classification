def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)


 def length_of_string(mystring):
   if type(mystring) == int:
       return "invalid entry"
   else:
       word_length = 0
       for x in mystring:
           word_length += 1
       return word_length


