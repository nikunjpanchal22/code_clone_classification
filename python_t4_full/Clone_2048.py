def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		result = [el for el in lst if all(el in line for line in lines)]
		return result


  def index(filename, lst) :
        with open(filename, 'r') as infile :
            lines = [line.split() for line in infile]
            result = []
            for line in lines:
                for element in lst:
                    if element not in result and element in line:
                        result.append(element)
            return result


