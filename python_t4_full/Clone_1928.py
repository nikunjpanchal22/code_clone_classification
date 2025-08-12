def integer(s) :
	if isinstance(s, int) :
		return True
	if isinstance(s, str) :
		for i in s :
			if i in "0123456789" :
				return True
	return False


 def integer(s):
  if type(s) == int or type(s) == str:
    #return false if string contain non numeric character
    return not any(x not in "0123456789" for x in str(s))
  else:
    return False


