def shift_cipher_noloop(plain, i) :
	if (plain == "") :
		return ""
	else :
		if len(plain) > 3 and i > 0 :
			return shift_cipher_noloop(plain [1 :] + plain [0], i - 1)
		else :
			return plain


  return shift_cipher_noloop(plain[1:] + plain[0], i - 1) if plain and len(plain) > 3 and i > 0 else plain




def shift_cipher_noloop(plain, i) :
  if plain:
    if len(plain) > 3:
      if i > 0:
        return shift_cipher_noloop(plain[1:] + plain[0], i - 1)
  return plain



