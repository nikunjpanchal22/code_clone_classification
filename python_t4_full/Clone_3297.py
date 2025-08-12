def collatz(starting_value) :
	value = starting_value
	while value ! = 1 :
		value = (3 * value + 1) if value % 2 else (value / / 2)
		yield value



def collatz(num):
    while num > 1:
        num = num * 3 + 1 if num % 2 else num // 2
        yield num



