def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)


 def length_of_string(mystring):
   if type(mystring) == int:
       return "invalid entry"
   else :
       char_number = 0
       for x in mystring:
           char_number = char_number + 1
       return char_number


