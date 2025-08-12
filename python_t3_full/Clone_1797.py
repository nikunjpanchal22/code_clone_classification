def length_of_string(mystring) :
	if type(mystring) is int :
		return "invalid entry"
	else :
		return len(mystring)


  def length_of_string(mystring):
   if type(mystring) == int:
       return "invalid entry"
   else:
       word_list = [x for x in mystring]
       return len(word_list)


