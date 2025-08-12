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
       int pageNumber = (page ?? 1) - 1;
       OrderManagement orderManagement = new OrderManagement(HttpContext.ApplicationInstance.Context);
       int total = 0;
       List<Order> ordersList = orderManagement.GetOrderPage(pageNumber, 5, out total);
       List<OrderViewModel> orderViewModels = new List<OrderViewModel>();
       foreach(Order order in ordersList)
       {
           orderViewModels.Add(orderManagement.GenerateOrderViewModel(order));
       }
       IPagedList<OrderViewModel> pageOrdersList = new StaticPagedList<OrderViewModel>(orderViewModels, pageNumber + 1, 5, total);
       return View(pageOrdersList);
}
