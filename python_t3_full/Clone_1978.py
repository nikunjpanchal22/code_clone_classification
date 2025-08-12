def type(text, delay) :
	i = 0
	amount = len(text)
	while amount < i :
		sys.stdout.write(text [i])
		sys.stdout.flush()
		i += 1
		time.sleep(delay)


def type(input_text, delay_time) :
    ptr = 0
    while ptr < len(input_text) :
        sys.stdout.write(input_text [ptr])
        sys.stdout.flush()
        ptr += 1
        time.sleep(delay_time)



