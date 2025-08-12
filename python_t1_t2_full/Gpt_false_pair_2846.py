def decode(number, base) :
	try :
		int(base)
	except ValueError :
		raise ValueError('decode(value,base): base must be in base10')
	else :
		base = int(base)
	number = str(number)
	if base < 2 :
		base = 2
	if base > 62 :
		base = 62
	numbers = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f",
	"g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
	"w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
	"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]
	final = 0
	if number.startswith("-") :
		neg = True
		number = list(number)
		del (number [0])
		temp = number
		number = ""
		for x in temp :
			number = "{}{}".format(number, x)
	else :
		neg = False
	loc = len(number) - 1
	number = str(number)
	for x in number :
		if numbers.index(x) > base :
			raise ValueError('{} is out of base{} range'.format(x, str(base)))
		final = final + (numbers.index(x) * (base ** loc))
		loc = loc - 1
	if neg :
		return - final
	else :
		return final




def decode(number, base):
	try:
		base = int(base)
	except ValueError:
		raise ValueError('decode(value,base): base must be in base10')
	number = str(number)
	if base < 2:
		base = 2
	if base > 62:
		base = 62
	numbers = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F",
			"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
			"W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
			"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
	final = 0
	if number[0] == '-':
		is_negative = True
		number = list(number)
		del (number[0])
		temp = number
		number = ""
		for x in temp:
			number = "{}{}".format(number, x)
	else:
		is_negative = False
	num_len = len(number) - 1
	for x in number:
		if numbers.index(x) > base:
			raise ValueError('{} is out of base{} range'.format(x, str(base)))
		final = final + (numbers.index(x) * (base ** num_len))
		num_len = num_len - 1
	if is_negative:
		return - final
	else:
		return final
