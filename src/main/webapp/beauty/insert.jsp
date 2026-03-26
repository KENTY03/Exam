<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<h2>新規登録</h2>
<form action="insert" method="post">
<p>ユーザー名<input type="text" name="login"></p>
<p>パスワード<input type="password" name="password"></p>
<p><input type="submit" value="登録"></p>
</form>

<%@include file="../footer.html"%>