def num_input(prompt, error) :
	while True :
		result = raw_input(prompt)
		for candidate in (int, float) :
			try : return candidate(result)
			except ValueError : pass
		print(error)


 def num_input(prompt, error) :
        while True:
            result = input(prompt)
            try:
                val = int(result)
            except ValueError:
                try:
                    val = float(result)
                except ValueError:
                    print(error)
            else:
                return val


