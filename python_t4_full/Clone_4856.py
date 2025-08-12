def parse(self, response) :
	hxs = HtmlXPathSelector(response)
	sites = hxs.select('//div[@id="col_3"]//div[@id="module3_1"]//div[@id="moduleData4952"]')
	items = []
	for site in sites :
		item = Website()
		item ['header'] = site.select('//div[@class="scoreboard-bar"]//h2//span[position()>1]//text()').extract()
		item ['game1'] = site.select('/*//table[position()=1]//tr//td[@class="tbl-odds-c2"]//text() | /*//table[position()=1]//tr//td[@class="tbl-odds-c4"]//text() | /*//table[position()=1]//tr//td[@class="tbl-odds-c6"]//text()').extract()
		items.append(item)
	self.task_urls.remove(response.url)
	if self.task_urls :
		r = Request(url = self.task_urls [0], callback = self.parse)
		items.append(r)
	return items


    self.task_urls.remove(response.url)
    if self.task_urls:
        r = Request(url = self.task_urls[0], callback = self.parse)
        itemList.append(r)
    return itemList



def parse(self, response):
    hxs = HtmlXPathSelector(response)
    sites = hxs.xpath('//div[@id="article"]//div[@id="articleBlock1"]//div[@id="articleBlockData448"]')
    itemsCollection = []
    for site in sites:
        item = ArticleItem()
        item['articleTitle'] = site.xpath('//div[@class="header-bar"]//h3//span[position()>1]//text()').extract()


