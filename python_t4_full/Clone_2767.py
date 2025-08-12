def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)


 def length_of_string(mystring):
   if type(mystring) == int:
       return "invalid entry"
   else:
       character_count = 0
       for letter in mystring:
           character_count += 1
       return character_count


