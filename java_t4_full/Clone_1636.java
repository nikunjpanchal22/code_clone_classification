public void doFilter (ServletRequest arg0, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    logger.info ("checking client id in filter");
    HttpServletRequest request = (HttpServletRequest) arg0;
    String clientId = request.getHeader ("clientId");
    if (StringUtils.isNotEmpty (clientId)) {
        chain.doFilter (request, response);
    } else {
        logger.error ("client id missing.");
    }
}


 public void doFilter (ServletRequest arg0, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    logger.info ("checking client id in filter");
    String sessionId = arg0.getParameter("jsessionid");
    HttpSession session = ((HttpServletRequest) arg0).getSession(false);
    if (session == null) {
        session = ((HttpServletRequest) arg0).getSession(true);
        session.setAttribute("jsessionid", sessionId);
        String clientId = session.getAttribute("clientId").toString();
    }
    else {
        String clientId = session.getAttribute("clientId").toString();
    }
    if (StringUtils.isNotEmpty (clientId)) {
        chain.doFilter (arg0, response);
    } else {
        logger.error ("client id missing.");
    }
}


