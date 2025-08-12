def listFunc(lst) :
	if len(lst) == 0 : return ''
	if len(lst) == 1 : return lst [0]
	firstPart = lst [: - 1]
	retFirst = ", ".join(firstPart)
	retSecond = ", and " + lst [- 1]
	return retFirst + retSecond


 def listFunc(lst) :
        if len(lst) == 0:
            return '' 
        elif len(lst) == 1:
            return lst[0] 
        else:
            firstPart = lst[0:-1]
            retFirst = ', '.join(firstPart)
            retSecond = ' and ' + lst[-1] 


