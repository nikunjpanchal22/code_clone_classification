def __init__(self, width) :
	if width < 0 :
		print ('Width cannot be less than zero.')
	else :
		self.width = width


  def __init__(self, width):
		if width < 0:
			raise ValueError('Width cannot be less than zero.')
		else:
			self.width = width
