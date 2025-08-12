def __init__(self, type, parent = None) :
	super().__init__()
	self.parent = parent
	self.Type = type
	self.setStyleSheet("""QSlider::groove:vertical {
	border: 1px solid black;
	height: """ + str(groove_y) + """ px;
	width: 10px;
	border-radius: 2px;
	}
	QSlider::handle:vertical {
	background: red;
	border: 1px solid red;
	height: """ + str(handle_height) + """ px;
	margin: 2px 0;
	border-radius: 1px;
	}
	QSlider::add-page:vertical {
	background: blue;
	}
	QSlider::sub-page:vertical {
	background: red;
	""")




def __init__(self, type, parent = None) :
	super().__init__()
	self.parent = parent
	self.Type = type
	self.setStyleSheet("""QSlider::groove:vertical {
	border: 3px solid black;
	height: """ + str(groove_y) + """ px;
	width: 20px;
	border-radius: 6px;
	}
	QSlider::handle:vertical {
	background: orange;
	border: 3px solid orange;
	height: """ + str(handle_height) + """ px;
	margin: 6px 0;
	border-radius: 3px;
	}
	QSlider::add-page:vertical {
	background: grey;
	}
	QSlider::sub-page:vertical {
	background: orange;
	""")
