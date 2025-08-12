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
	angles = self.get_rotation()
	self.set_rotation(0)
	self.set_va(self.__Va)
	self.set_ha(self.__Ha)
	image = self.axes.figure.canvas.get_renderer()
	outline1 = self.get_window_extent(renderer = image)
	self.set_va('center')
	self.set_ha('center')
	outline2 = self.get_window_extent(renderer = image)
	movement = np.array(outline2.get_points() [0] - outline1.get_points() [0])
	radian_angle = np.deg2rad(angles)
	rot_matrix = np.array([
	[np.cos(radian_angle), np.sin(radian_angle)],
	[- np.sin(radian_angle), np.cos(radian_angle)]])
	move_position = np.dot(movement, rot_matrix)
	displacement = matplotlib.transforms.Affine2D().translate(- move_position [0], - move_position [1])
	self.set_rotation(angles)
	return displacement

