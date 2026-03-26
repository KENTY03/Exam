<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>


こちらは美容院予約サイトです。

<form action="${pageContext.request.contextPath}/beauty/chiikawa.jsp" method="post">
<h2>u'ru　　<input type="submit" value="予約"></h2>
<p>カット ￥6,000</p>
<p>カラー ￥8,000</p><br>
</form>

<form action="${pageContext.request.contextPath}/beauty/hachiware.jsp" method="post">
<h2>mlife　　<input type="submit" value="予約"></h2>
<p>ダブルカラー ￥16,000</p>
<p>ヘアセット ￥5,000</p><br>
</form>

<form action="${pageContext.request.contextPath}/beauty/usagi.jsp" method="post">
<h2>nid　　<input type="submit" value="予約"></h2>
<p>縮毛矯正 ￥14,000</p>
<p>似合わせカット ￥6,000</p><br>
</form>


<%@include file="../footer.html"%>