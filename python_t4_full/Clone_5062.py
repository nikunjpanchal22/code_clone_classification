def base_and_num(number, base) :
	number = int(number)
	while number ! = 0 :
		digit = number % 10
		if digit > base :
			return False
		number = number / 10
	return True




 

def base_and_num(number, base):
	def iterator(number):
		if not number:
			return True
		if int(number[-1]) > base:
			return False


