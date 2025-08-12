def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		result = [el for el in lst if all(el in line for line in lines)]
		return result


  def index(filename, lst) :
        with open(filename, 'r') as infile :
            lines = [line.split() for line in infile]
            result = list(filter(lambda x : any(x in lin for lin in lines), lst))
            return result
