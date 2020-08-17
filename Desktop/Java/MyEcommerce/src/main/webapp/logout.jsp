<html>
<head>
</head>
<body>
<% session.invalidate();%>
<% HttpSession nsession = request.getSession(false);
if(nsession!=null) {
   String data=(String)session.getAttribute( "val" );
   out.println(data);
}
else
  out.println("Session is not active");
%>

</body>
</html>