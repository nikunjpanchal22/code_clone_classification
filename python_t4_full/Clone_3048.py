def num_input(prompt, error) :
	while True :
		result = raw_input(prompt)
		for candidate in (int, float) :
			try : return candidate(result)
			except ValueError : pass
		print error






def num_input(prompt, error):
    while True:
        inp = input(prompt)
        if isinstance(inp, (int, float)):
            return inp


