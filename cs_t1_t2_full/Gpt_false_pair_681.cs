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
       int number = (page ?? 1) - 1;
       OrderManagement oManagement = new OrderManagement(HttpContext.ApplicationInstance.Context);
       int count = 0;
       List<Order> orderPage = oManagement.GetOrderPage(number, 5, out count);
       List<OrderViewModel> viewModels = new List<OrderViewModel>();
       foreach(Order order in orderPage)
       {
           viewModels.Add(oManagement.GenerateOrderViewModel(order));
       }
       IPagedList<OrderViewModel> pageOrders = new StaticPagedList<OrderViewModel>(viewModels, number + 1, 5, count);
       return View(pageOrders);
}
