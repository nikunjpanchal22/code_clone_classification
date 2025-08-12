def download(url, fileName = None) :
    if (fileName == None):
      fileName = url.split('/').pop()


 def download(url, fileName = None):
    if not fileName:
        seperateUrl = url.split('/')
        fileName = seperateUrl.pop()


