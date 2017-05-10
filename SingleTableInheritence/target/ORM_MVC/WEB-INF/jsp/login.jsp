<%--
  User: yy
  Date: 3/11/14
  Time: 4:37 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="en"> <!--<![endif]-->
<html>
<body>
<%@include file="head.jsp" %>
    <div class="container">
        <!-- 点击触发后，将内容进行更改data-complete-text表示为完成后的内容 -->
        <button  type="button"   class="btn btn-primary  mybtn"  data-complete-text="finish"  autocomplete="off">点击后内容自动更改</button>
        <script>
           $('.mybtn').on('click', function () {
                $(this).button('complete') // 内容将变为finish
            })
        </script>

        <div class="row">
            <div>
                <form action="${context}">
                  <div class="form-group">
                    <label for="exampleInputEmail1" >
                          <span class="glyphicon glyphicon-user"></span>
                    </label>
                    <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Email">
                  </div>
                  <div class="form-group">
                    <label for="exampleInputPassword1">
                        <span class="glyphicon glyphicon-lock"></span>
                    </label>
                    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                  </div>
                  <!--<div class="form-group">
                    <label for="exampleInputFile">File input</label>
                    <input type="file" id="exampleInputFile">
                    <p class="help-block">Example block-level help text here.</p>
                  </div>
                  <div class="checkbox">
                    <label>
                      <input type="checkbox"> 记住我
                    </label>
                  </div>-->
                  <button type="submit" class="btn btn-default">登录</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>