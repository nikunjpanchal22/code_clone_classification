def collatz(starting_value) :
	value = starting_value
	while value ! = 1 :
		value = (3 * value + 1) if value % 2 else (value / / 2)
		yield value




def collatz(x):
    while x > 1:
        x = 3 * x + 1 if x % 2 else x // 2
        yield x


