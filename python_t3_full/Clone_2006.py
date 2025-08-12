def collatz(starting_value) :
	value = starting_value
	while value ! = 1 :
		value = (3 * value + 1) if value % 2 else (value / / 2)
		yield value




def collatz(num):
    while num != 1:
        num = num // 2 if num % 2 == 0 else num * 3 + 1
        yield num


