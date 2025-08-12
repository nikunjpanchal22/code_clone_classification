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
       int pageNo = (page ?? 1) - 1;
       OrderManagement management = new OrderManagement(HttpContext.ApplicationInstance.Context);
       int totalOrderCount = 0;
       List<Order> orders = management.GetOrderPage(pageNo, 5, out totalOrderCount);
       List<OrderViewModel> orderViewModels = new List<OrderViewModel>();
       foreach(Order order in orders)
       {
           orderViewModels.Add(management.GenerateOrderViewModel(order));
       }
       IPagedList<OrderViewModel> pageOrders = new StaticPagedList<OrderViewModel>(orderViewModels, pageNo + 1, 5, totalOrderCount);
       return View(pageOrders);
}
