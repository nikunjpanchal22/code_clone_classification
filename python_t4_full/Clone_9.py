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
                return int(result)
            except ValueError:
                try:
                    return float(result)
                except ValueError:
                    for item in result:
                        if item not in ('.','0','1','2','3','4','5','6','7','8','9'):
                            print(error)
                            break
                    else:
                        return result


