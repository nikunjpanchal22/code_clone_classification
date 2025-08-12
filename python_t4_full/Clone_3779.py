def __init__(self, parent = None) :
	super(UploadThread, self).__init__(parent)
	self.endNow = False
	self.fileName = None
	self.sig = MySigObj()
	self.fileNames = []
	self.uploaded = []


 

def __init__(self, parent = None):
    super().__init__(parent)
    self.endNow = False
    self.fileName = ''
    self.sig = MySigObj()
    self.fileNames = list()


