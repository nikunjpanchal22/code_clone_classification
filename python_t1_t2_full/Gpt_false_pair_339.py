def scraper(pageNum) :
	while pageNum < SOME_TARGET_VALUE :
		req = Request("http://www.someurl.com/Search/page=" + str(pageNum) + "&facet_Category=20", headers = {"User-Agent" : "Mozilla/5.0"})
		html = urlopen(req).read()
		bsObj = BeautifulSoup(html)
		for result in bsObj.select("h2 a") :
			print (result ["href"])
		pageNum += 1


#gpt output=============
 def scraper(pageNum) :
    while pageNum < SOME_TARGET_VALUE :
		pageNum += 1
		req = Request("http://www.someurl.com/Search/page=" + str(pageNum) + "&facet_Category=20", headers = {"User-Agent" : "Mozilla/5.0"})
		html = urlopen(req).read()
		bsObj = BeautifulSoup(html)
		for result in bsObj.select("h2 a") :
			print (result ["href"])
