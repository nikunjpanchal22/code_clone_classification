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
	if S [0] not in string.ascii_uppercase :
		return False
	if S [1] not in "0123456789" :
		return False
	return S.upper()


