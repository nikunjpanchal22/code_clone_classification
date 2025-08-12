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
        int pageNo = (page ?? 1) - 1 ;
        OrderManagement orderMgt = new OrderManagement(HttpContext.ApplicationInstance.Context);
        int countRec = 0;
        List<Order> orderList = orderMgt.GetOrderPage(pageNo, 5, out countRec);
        List<OrderViewModel> ordViewModels = new List<OrderViewModel>();
        foreach(Order order in orderList)
        {
            ordViewModels.Add(orderMgt.GenerateOrderViewModel(order));
        }
        IPagedList<OrderViewModel> pageOrders = new StaticPagedList<OrderViewModel>(ordViewModels, pageNo + 1, 5, countRec);
        return View(pageOrders);
}
