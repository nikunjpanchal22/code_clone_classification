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

	rem = x % b 
	result = alphabet[rem]
	q = x // b 
	while q > 0 :
		rem = q % b
		q = q // b 
		result = alphabet[int(rem)] + result
	return result


