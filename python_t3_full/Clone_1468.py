def postalValidate(S) :
	S = S.replace(" ", "")
	if len(S) != 6 or S.isalpha() or S.isdigit() :
		return False
	if not S [0 : 5 : 2].isalpha() :
		return False
	if not S [1 : 6 : 2].isdigit() :
		return False
	return S.upper()


 def postalValidate(S) :
	S = S.replace(" ", "")
	if len(S) != 6 or not S.isalnum() :
		return False
	if not S [0 : 3].isalpha() or not S [3 : 6].isdigit() :
		return False
	return S.upper()


