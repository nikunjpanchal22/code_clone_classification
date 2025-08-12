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
            if any(c.isalpha() for c in result):
                print(error)
            else:
                if '.' in result:
                    return float(result)
                else: 
                    return int(result)


