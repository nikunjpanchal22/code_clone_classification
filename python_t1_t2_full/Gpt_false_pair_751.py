def __init__(self, parent = None) :
	super(UploadThread, self).__init__(parent)
	self.endNow = False
	self.fileName = None
	self.sig = MySigObj()
	self.fileNames = []
	self.uploaded = []


 def __init__(self, parent = None) :
    super(UploadThread, self).__init__(parent)
    self.finishImmediately = False
    self.item_name = None
    self.upload_signal = MySigObj()
    self.folio = []
    self.uploaded_files = []    
