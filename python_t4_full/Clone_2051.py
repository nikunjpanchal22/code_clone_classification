def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		result = [el for el in lst if all(el in line for line in lines)]
		return result


  def index(filename, lst) :
        with open(filename, 'r') as infile :
            lines = [line.split() for line in infile]
            result = []
            for item in lst:
                if all(item in line for line in lines):
                    result.append(item)
            return list(set(result))


