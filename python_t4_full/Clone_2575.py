def download(url, fileName = None) :
    if (fileName == None):
      fileName = url.split('/').pop()


 def download(url, fileName = None) :
    if not fileName:
        splitUrl = url.split('/')
        fileName = splitUrl[len(splitUrl) - 1]


