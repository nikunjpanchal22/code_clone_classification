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




def update_position(self) :
	rotation = self.get_rotation()
	self.set_rotation(0)
	self.set_va(self.__Va)
	self.set_ha(self.__Ha)
	picture = self.axes.figure.canvas.get_renderer()
	frame1 = self.get_window_extent(renderer = picture)
	self.set_va('center')
	self.set_ha('center')
	frame2 = self.get_window_extent(renderer = picture)
	shift = np.array(frame2.get_points() [0] - frame1.get_points() [0])
	radian = np.deg2rad(rotation)
	turn_matrix = np.array([
	[np.cos(radian), np.sin(radian)],
	[- np.sin(radian), np.cos(radian)]])
	shift_position = np.dot(shift, turn_matrix)
	change = matplotlib.transforms.Affine2D().translate(- shift_position [0], - shift_position [1])
	self.set_rotation(rotation)
	return change

