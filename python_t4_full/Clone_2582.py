def download(url, fileName = None) :
    if (fileName == None):
      fileName = url.split('/').pop()


 def download(url, fileName = None) :
    if fileName == None: 
        fileName = url[url.rfind('/')+1:]


