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
		first_letter = plain[0]
		remaining_letters = plain[1:]
		return shift_cipher_noloop(remaining_letters + first_letter, i - 1)
	else :
		return plain



