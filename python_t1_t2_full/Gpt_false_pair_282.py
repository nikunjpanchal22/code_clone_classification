def ask_digit() :
	while True :
		digit = raw_input("Please enter a number between 1 and 5: ")
		if re.match(r"[1-5]$", digit) :
			return int(digit)


def ask_digit() :
	while True :
		digit = raw_input("Please enter a number between 1 and 5: ")
		if digit.isdigit() and int(digit) in range(1, 6) :
			return int(digit)

