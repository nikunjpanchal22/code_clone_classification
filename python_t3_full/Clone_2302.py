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




def update_position(self, rotation=None):
    rotation = rotation or self.get_rotation()
    self.set_rotation(0)
    self.set_va(self._Va)
    self.set_ha(self._Ha)
    r = self.axes.figure.canvas.get_renderer()
    bbox1 = self.get_window_extent(r)
    self.set_va('center')
    self.set_ha('center')
    bbox2 = self.get_window_extent(r)
    dr = np.array(bbox2.get_points() - bbox1.get_points()[0])
    rad = np.deg2rad(rotation)
    rot_mat = np.array([[np.cos(rad), -np.sin(rad)], [np.sin(rad), np.cos(rad)]])
    drp = np.dot(dr, rot_mat)
    offset = matplotlib.transforms.Affine2D().translate(- drp[0], - drp[1])
    self.set_rotation(rotation)


