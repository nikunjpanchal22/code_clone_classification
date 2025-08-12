def postalValidate(S) :
	S = S.replace(" ", "")
	if len(S) ! = 6 or S.isalpha() or S.isdigit() :
		return False
	if not S [0 : 5 : 2].isalpha() :
		return False
	if not S [1 : 6 : 2].isdigit() :
		return False
	return S.upper()


def postalValidate(S):
    S = S.replace(" ","")
    return S.upper() if (len(S) == 6 and all(c.isalpha() for c in S[::2]) and all(c.isdigit() for c in S[1::2])) else False


 



