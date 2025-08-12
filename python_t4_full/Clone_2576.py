def download(url, fileName = None) :
    if (fileName == None):
      fileName = url.split('/').pop()


 def download(url, fileName = None) :
    if fileName == None:
        seprateUrl = url.split('/')
        fileName = "".join(seprateUrl[-1:])


