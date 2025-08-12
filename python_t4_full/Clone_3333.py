def print_data(items) :
	i = 0
	while i < len(items) :
		print items [i]
		i += 1



def print_data(items):
    i = 0
    while True:
        try:
            print(items[i])
            i += 1
        except IndexError:
            break




