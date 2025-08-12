public ActionResult Index (int ? page) {
    int pagenumber = (page ?? 1) - 1;
    OrderManagement orderMan = new OrderManagement (HttpContext.ApplicationInstance.Context);
    int totalCount = 0;
    List < Order > orders = orderMan.GetOrderPage (pagenumber, 5, out totalCount);
    List < OrderViewModel > orderViews = new List < OrderViewModel > ();
    foreach (Order order in orders) {
        orderViews.Add (orderMan.GenerateOrderViewModel (order));
    }
    IPagedList < OrderViewModel > pageOrders = new StaticPagedList < OrderViewModel > (orderViews, pagenumber + 1, 5, totalCount);
    return View (pageOrders);
}


 public ActionResult Index(int? page)
   {
       int pageNum = (page ?? 1) - 1;
       OrderManagement orderManagement = new OrderManagement(HttpContext.ApplicationInstance.Context);
       int recordCount = 0;
       List<Order> orders = orderManagement.GetOrderPage(pageNum, 5, out recordCount);
       List<OrderViewModel> orderViews = new List<OrderViewModel>();
       foreach(Order order in orders)
       {
           orderViews.Add(orderManagement.GenerateOrderViewModel(order));
       }
       IPagedList<OrderViewModel> pageOrders = new StaticPagedList<OrderViewModel>(orderViews, pageNum + 1, 5, recordCount);
       return View(pageOrders);
}
