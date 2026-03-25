<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h2>u'ru</h2>
<form action="chiikawa.action" method="post">
<p>メニュー<!--"option"がパラメータ名--><br>
<input type="checkbox" name="option" value="カット">カット ￥6,000<br>
<input type="checkbox" name="option" value="カラー">カラー ￥8,000
</p>
<input type="date" name="date">
<input type="time" name="time"><br>
<p><input type="submit" value="確認">　　
<a href="index.jsp">戻る</a></p>
</form>

<%@include file="../footer.html"%>