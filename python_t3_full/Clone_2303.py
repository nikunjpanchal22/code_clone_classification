def update_position(self) :
	rotation = self.get_rotation()
	self.set_rotation(0)
	self.set_va(self.__Va)
	self.set_ha(self.__Ha)
	renderer = self.axes.figure.canvas.get_renderer()
	bbox1 = self.get_window_extent(renderer = renderer)
	self.set_va('center')
	self.set_ha('center')
	bbox2 = self.get_window_extent(renderer = renderer)
	dr = np.array(bbox2.get_points() [0] - bbox1.get_points() [0])
	rad = np.deg2rad(rotation)
	rot_mat = np.array([
	[np.cos(rad), np.sin(rad)],
	[- np.sin(rad), np.cos(rad)]])
	drp = np.dot(dr, rot_mat)
	offset = matplotlib.transforms.Affine2D().translate(- drp [0], - drp [1])
	self.set_rotation(rotation)
	return offset


    self.set_rotation(rotation)
    return offset



def update_position(self) :
    rotation = self.get_rotation()
    self.set_rotation(0)
    self.set_va(self.__Va)
    self.set_ha(self.__Ha)
    renderer = self.axes.figure.canvas.get_renderer()
    bbox1 = self.get_window_extent(renderer)
    self.set_va('center')
    self.set_ha('center')
    bbox2 = self.get_window_extent(renderer)
    dr = np.subtract(bbox2.get_points()[0],bbox1.get_points()[0])
    rad = math.radians(rotation)
    rot_mat = np.array([ 
    [math.cos(rad), math.sin(rad)], 
    [-math.sin(rad), math.cos(rad)] 
    ])


