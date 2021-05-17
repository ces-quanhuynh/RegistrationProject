<%@ include file="../init.jsp" %>

<p>
	<b><liferay-ui:message key="adminmonitor.caption"/></b>
</p>

<liferay-ui:tabs
		names="<%= "All,Registration,Login" %>"
		refresh="<%= false %>"
		value="${selectedTab}"
>
	<liferay-ui:section>
		<%@ include file="/adminmonitor/view_all.jsp" %>
	</liferay-ui:section>

	<liferay-ui:section>
		<%@ include file="/adminmonitor/view_registration.jsp" %>
	</liferay-ui:section>

	<liferay-ui:section>
		<%@ include file="/adminmonitor/view_login.jsp" %>
	</liferay-ui:section>
</liferay-ui:tabs>