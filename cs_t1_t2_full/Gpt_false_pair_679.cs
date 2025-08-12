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
       int pg = (page ?? 1) - 1;
       OrderManagement mgr = new OrderManagement(HttpContext.ApplicationInstance.Context);
       int count = 0;
       List<Order> ord = mgr.GetOrderPage(pg, 5, out count);
       List<OrderViewModel> orderVws = new List<OrderViewModel>();
       foreach(Order order in ord)
       {
           orderVws.Add(mgr.GenerateOrderViewModel(order));
       }
       IPagedList<OrderViewModel> pageOrders = new StaticPagedList<OrderViewModel>(orderVws, pg + 1, 5, count);
       return View(pageOrders);
}
