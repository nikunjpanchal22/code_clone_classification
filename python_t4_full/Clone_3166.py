def __init__(self, width) :
	if width < 0 :
		print ('Width cannot be less than zero.')
	else :
		self.width = width




def __init__(self, width):
  self.width = (lambda x: x if x >= 0 else 0)(width)
  if width < 0: print('Width cannot be less than zero.')




