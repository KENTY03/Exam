<%@page contentType="text/html; charset=UTF-8"%>
<%@include file="../header.html"%>

<form action="Login.action" method="post">
<p>ログイン名<input type="text" name="login"></p>
<p>パスワード<input type="password" name="password"></p>
<p><input type="submit" value="ログイン"></p>
</form>

新規登録の場合は<a href="${pageContext.request.contextPath}/beauty/insert.jsp">こちら</a>

<%@include file="../footer.html"%>