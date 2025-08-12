def index(filename, lst) :
	with open(filename, 'r') as infile :
		lines = [line.split() for line in infile]
		result = [el for el in lst if all(el in line for line in lines)]
		return result


  def index(filename, lst) :
        with open(filename, 'r') as infile :
            lines = [line.split() for line in infile]
            index = 0
            result = []
            while index < len(lst):
                if lst[index] in lines:
                    result.append(lst[index])
                index += 1
            return result


