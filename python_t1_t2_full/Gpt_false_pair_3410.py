def checkio(data) :
	elements = []
	duplicates = []
	for i in data :
		if i not in elements :
			elements.append(i)
		else :
			if i not in duplicates :
				duplicates.append(i)
	return duplicates




def checkio(data):
  elements = []
  duplicates = []
  for item in data:
    if item not in elements:
        elements.append(item)
    elif item not in duplicates:
        duplicates.append(item)
  return duplicates
