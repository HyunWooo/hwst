package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          // /login.jsp(7,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginFail=='Y'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
          if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t<script>\r\n");
              out.write("\t\t\t\talert(\"아이디와 패스워드를 다시 확인하세요.\");\r\n");
              out.write("\t\t\t\t");
session.removeAttribute("loginFail");
              out.write("\r\n");
              out.write("\t\t\t\thistory.go();\r\n");
              out.write("\t\t\t</script>\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
          out.write("\r\n");
          out.write("\t\t");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return;
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://s.011st.com/img/common/icon/favicon.ico\"  type=\"image/x-ico\">\r\n");
      out.write("    <title>현우st</title>\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/price-range.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/animate.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/main.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/responsive.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->       \r\n");
      out.write("    <!-- <link rel=\"shortcut icon\" href=\"images/ico/favicon.ico\"> -->\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/ico/apple-touch-icon-144-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/ico/apple-touch-icon-114-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/ico/apple-touch-icon-72-precomposed.png\">\r\n");
      out.write("    <link rel=\"apple-touch-icon-precomposed\" href=\"images/ico/apple-touch-icon-57-precomposed.png\">\r\n");
      out.write("</head><!--/head-->\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<header id=\"header\"><!--header-->\r\n");
      out.write("\t\t<div class=\"header_top\"><!--header_top-->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"contactinfo\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a><i class=\"fa fa-star\"></i> 관리자 문의</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact_us.do\"><i class=\"fa fa-phone\"></i> 010-3341-3855</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact_us.do\"><i class=\"fa fa-envelope\"></i> gusdn@sk.com</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6 col-xs-8\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"shop-menu pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <li><a href=\"#\"><i class=\"fa fa-user\"></i> Account</a></li> -->\r\n");
      out.write(" \t\t\t\t\t\t\t\t<!--<li><a href=\"#\"><i class=\"fa fa-star\"></i> Wishlist</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/header_top-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"header-middle\"><!--header-middle-->\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"logo pull-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"index.do\"><img src=\"images/home/logo.png\" alt=\"\" /></a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- 안쓰는 버튼그룹 -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-group pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tUSA\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Canada</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">UK</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-default dropdown-toggle usa\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tDOLLAR\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"caret\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Canadian Dollar</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Pound</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div> -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-8\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"search_box pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"mainmenu pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav navbar-nav collapse navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"index.do\" class=\"active\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\">Shop<i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                    <ul role=\"menu\" class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"allProductView.do\">상품전체보기</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li> \r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <li class=\"dropdown\"><a href=\"#\">Blog<i class=\"fa fa-angle-down\"></i></a>\r\n");
      out.write("                                    <ul role=\"menu\" class=\"sub-menu\">\r\n");
      out.write("                                        <li><a href=\"blog.jsp\">Blog List</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"blog_single.jsp\">Blog Single</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </li>  -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- <li><a href=\"404.jsp\">404</a></li> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"contact_us.do\">Contact-us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!--/header-middle-->\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- <div class=\"header-bottom\">header-bottom\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"search_box pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> --><!--/header-bottom-->\r\n");
      out.write("\t</header><!--/header-->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<section id=\"form\"><!--form-->\r\n");
      out.write("\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-4 col-sm-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-form\"><!--login form-->\r\n");
      out.write("\t\t\t\t\t\t\t\t<h2>당신의 계정으로 로그인하세요</h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"loginProcess.do\" method=\"post\" name=\"loginProcess.do\" id=\"inForm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"text-field\" placeholder=\"아이디(이메일)\" name=\"id\" id=\"id\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"text-field\" placeholder=\"비밀번호\" name=\"pw\" id=\"pw\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Login</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div><!--/login form-->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</section><!--/form-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<footer id=\"footer\"><!--Footer-->\r\n");
      out.write("\t\t<!-- <div class=\"footer-widget\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Service</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Online Help</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Order Status</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Change Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">FAQ’s</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Quock Shop</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">T-Shirt</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Mens</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Womens</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Gift Cards</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Shoes</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Policies</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Terms of Use</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Privecy Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Refund Policy</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Billing System</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Ticket System</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>About Shopper</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-pills nav-stacked\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Company Information</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Careers</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Store Location</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Affillate Program</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Copyright</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3 col-sm-offset-1\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>About Shopper</h2>\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"searchform\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your email address\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\"><i class=\"fa fa-arrow-circle-o-right\"></i></button>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>Get the most recent updates from <br />our site and be updated your self...</p>\r\n");
      out.write("\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div> -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"footer-bottom\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"pull-left\">Copyright © 2015 HW. All rights reserved.</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- <div class=\"col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"single-widget\">\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"pull-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">About Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Faq</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\t -->\r\n");
      out.write("\t\t\t\t\t<!-- <p class=\"pull-right\">Designed by <span><a target=\"_blank\" href=\"http://www.themeum.com\">Themeum</a></span></p> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</footer><!--/Footer-->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("    <script src=\"js/jquery.js\"></script>\r\n");
      out.write("\t<script src=\"js/price-range.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.scrollUp.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /login.jsp(14,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.userLoginInfo.name}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<script>\r\n");
        out.write("\t\t\t\talert(\"이미 로그인 된 상태입니다.\");\r\n");
        out.write("\t\t\t\thistory.go(-1);\r\n");
        out.write("\t\t\t</script>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise_005fnobody.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise_005fnobody.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise_005fnobody.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent(null);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /login.jsp(68,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty sessionScope.userLoginInfo}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"cart.jsp\"><i class=\"fa fa-shopping-cart\"></i> Cart</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li><a href= \"userManagement.do\"><i class=\"fa fa-user\"></i>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.userLoginInfo.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("님</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"logoutProcess.do\"><i class=\"fa fa-crosshairs\"></i> Logout</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"chooseSignup.do\"><i class=\"fa fa-pencil\"></i> Sign Up</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"login.do\"><i class=\"fa fa-lock\"></i> Login</a></li>\r\n");
        out.write("\t\t\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }
}