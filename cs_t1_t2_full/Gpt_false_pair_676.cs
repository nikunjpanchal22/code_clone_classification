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
       int pageIndex = (page ?? 1) - 1;
       OrderManagement orderMgmt = new OrderManagement(HttpContext.ApplicationInstance.Context);
       int totalRecords = 0;
       List<Order> orders = orderMgmt.GetOrderPage(pageIndex, 5, out totalRecords);
       List<OrderViewModel> orderViewModels = new List<OrderViewModel>();
       foreach(Order order in orders)
       {
           orderViewModels.Add(orderMgmt.GenerateOrderViewModel(order));
       }
       IPagedList<OrderViewModel> pageOrders = new StaticPagedList<OrderViewModel>(orderViewModels, pageIndex + 1, 5, totalRecords);
       return View(pageOrders);
}
