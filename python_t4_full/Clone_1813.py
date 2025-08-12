def shift_cipher_noloop(plain, i) :
	if (plain == "") :
		return ""
	else :
		if len(plain) > 3 and i > 0 :
			return shift_cipher_noloop(plain [1 :] + plain [0], i - 1)
		else :
			return plain


def shift_cipher_noloop(plain, i) :
	if plain == "":
		return ""
	elif len(plain) > 3 and i > 0:
		first = plain[0]
		remaining = plain [1:]
		return shift_cipher_noloop(remaining + first, i - 1)
	else :
		return plain



