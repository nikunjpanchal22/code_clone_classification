def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)


 def length_of_string(mystring):
   if type(mystring) == int :
       return "invalid entry"
   else:
       letter_count = 0
       for letter in mystring :
           letter_count +=1
       return letter_count


