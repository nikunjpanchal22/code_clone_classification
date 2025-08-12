def download(url, fileName = None) :
    if (fileName == None):
      fileName = url.split('/').pop()


  def download(url, fileName = None) :
    if fileName == None:
        filenameWithPath = url.split('/')
        fileName = filenameWithPath[len(filenameWithPath) - 1]


