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


        item['pageTitle'] = site.xpath('//div[@class="header-div"]//h5//span[position()>1]//text()').extract()
        item['pageContent'] = site.xpath('/*//table[position()=1]//tr//td[@class="tbl-text-c1"]//text() | /*//table[position()=1]//tr//td[@class="tbl-text-c2"]//text() | /*//table[position()=1]//tr//td[@class="tbl-text-c3"]//text()').extract()
        items.append(item)
    self.task_urls.remove(response.url)
    if self.task_urls:
        r = Request(url = self.task_urls[0], callback = self.parse)
        items.append(r)
    return items



def parse(self, response):
    selector = HtmlXPathSelector(response)
    sites = selector.xpath('//div[@id="body-content"]//div[@id="module2_2"]//div[@id="dataBlock1234"]')


