package com.liferay.registration.web.portlet;

import com.liferay.registration.web.constants.SignUpPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author ces-user
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.registration",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=SignUp",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/signup/add_entry",
		"javax.portlet.name=" + SignUpPortletKeys.SIGNUP,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
			"javax.portlet.supports.mime-type=text/html",
			"javax.portlet.init-param.add-process-action-success-action=false"
	},
	service = Portlet.class
)
public class SignUpPortlet extends MVCPortlet {
}