def collatz(starting_value) :
	value = starting_value
	while value ! = 1 :
		value = (3 * value + 1) if value % 2 else (value / / 2)
		yield value


def collatz(i):
    while i != 1:
        i = i // 2 if i % 2 == 0 else i * 3 + 1
        yield i




