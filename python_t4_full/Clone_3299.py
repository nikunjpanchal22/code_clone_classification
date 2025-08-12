def collatz(starting_value) :
	value = starting_value
	while value ! = 1 :
		value = (3 * value + 1) if value % 2 else (value / / 2)
		yield value





def collatz(a):
    while a != 1:
        a = a // 2 if a % 2 == 0 else a * 3 + 1


