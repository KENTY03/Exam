<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h2>mlife</h2>
<form action="hachiware.action" method="post">
<p>メニュー<!--"option"がパラメータ名--><br>
<input type="checkbox" name="option" value="ダブルカラー">ダブルカラー ￥16,000<br>
<input type="checkbox" name="option" value="ヘアセット">ヘアセット ￥5,000
</p>
<input type="date" name="date">
<input type="time" name="time"><br>
<p><input type="submit" value="確認">　　
<a href="index.jsp">戻る</a></p>
</form>

<%@include file="../footer.html"%>