def collatz(starting_value) :
	value = starting_value
	while value ! = 1 :
		value = (3 * value + 1) if value % 2 else (value / / 2)
		yield value





def collatz(n):
    while n != 1:
        n = n * 3 + 1 if n % 2 else n // 2


