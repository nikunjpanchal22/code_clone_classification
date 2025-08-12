def int2base(x, b, alphabet = '0123456789abcdefghijklmnopqrstuvwxyz') :
	'convert an integer to its string representation in a given base'
	if b < 2 or b > len(alphabet) :
		if b == 64 :
			alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/'
		else :
			raise Valueerror('Invalid base: {0}'.format(b))


 def int2base(x, b, alphabet = '0123456789abcdefghijklmnopqrstuvwxyz'): 
	'convert an integer to its string representation in a given base'
	if b < 2 or b > len(alphabet):
		if b == 64:
			alphabet = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/'
		else:
			raise ValueError('Invalid base: {0}'.format(b))

	r = x % b 
	strRes = alphabet[r]
	q = x // b
	while q:
		r = q % b
		q = q // b
		strRes = alphabet[int(r)] + strRes
	return strRes


