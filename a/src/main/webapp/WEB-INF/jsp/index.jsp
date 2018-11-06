<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/showList" method="post" align="center" >
    <select name="a">
        <option value="0">--请选择--</option>
        <option value="1">车型</option>
        <option value="2">排量</option>
        <option value="3">厂家</option>
        <option value="4">年份</option>
    </select>
    <input type="text" name="b">
    <input type="submit" value="查询">
</form>
<table width="100%" border="1">
    <tr>
        <td>状态编号</td>
        <td>车辆编号</td>
        <td>车型</td>
        <td>排量</td>
        <td>年份</td>
        <td>厂家</td>
        <td>价格</td>
        <td>状态</td>
    </tr>
    <c:forEach items="${pager.datas}" var="res">
        <tr>
            <td>${res.reseverId}</td>
            <td>${res.carInfo.carId}</td>
            <td>${res.carInfo.carType}</td>
            <td>${res.carInfo.capacity}</td>
            <td>
                <fmt:formatDate value="${res.carInfo.produceDate}" pattern="yyyy"/>
            </td>
            <td>${res.carInfo.manufacturer}</td>
            <td>${res.carInfo.price}</td>
            <td>
                <c:if test="${res.status == 1 }">
                    已预定
                </c:if>
                <c:if test="${res.status == 0 }">
                    <a href="xg?id=${res.reseverId}">可预订</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
<div class="page-bar" align="center">
      共${pager.totalRows }条记录&nbsp;&nbsp; ${pager.pageNo }/${pager.totalPage }页
           <form action="/showList">
            <input type="text" name="pageNo" placeholder="请输入查询页数" required>
               <input type="submit" value="查询">
           </form>
            <c:if test="${pager.pageNo > 1}">
            <a href="showList?pageNo=1">首页</a>
            <a href="showList?pageNo=${pager.pageNo-1}">上一页</a>
            </c:if>
            <c:if test="${pager.pageNo < pager.totalPage }">
            <a href="showList?pageNo=${pager.pageNo+1}">下一页</a>
            <a href="showList?pageNo=${pager.totalPage}">尾页</a>
            </c:if>
</div>
</body>
</html>
