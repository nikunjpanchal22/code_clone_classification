def __init__(self, parent = None) :
	super(UploadThread, self).__init__(parent)
	self.endNow = False
	self.fileName = None
	self.sig = MySigObj()
	self.fileNames = []
	self.uploaded = []


 def __init__(self, parent = None) :
    super(UploadThread, self).__init__(parent)
    self.stopRightNow = False
    self.imageName = None
    self.uploadStatus = MySigObj()
    self.photos_arr = []
    self.loaded_items = []
