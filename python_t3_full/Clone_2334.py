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


        r = Request(url = self.task_urls[0], callback = self.parse)
        itemsList.append(r)
    return itemsList



def parse(self, response):
    selector = HtmlXPathSelector(response)
    sites = selector.xpath('//div[@id="blog_section"]//div[@id="blog_block1"]//div[@id="block_data629"]')
    blogItems = []
    for site in sites:
        item = BlogPost()
        item['postHeader'] = site.xpath('//div[@class="header-bar"]//h3//span[position()>1]//text()').extract()
        item['postContent'] = site.xpath('/*//table[position()=1]//tr//td[@class="tbl-post1-c2"]//text() | /*//table[position()=1]//tr//td[@class="tbl-post1-c4"]//text() | /*//table[position()=1]//tr//td[@class="tbl-post1-c6"]//text()').extract()
        blogItems.append(item)


