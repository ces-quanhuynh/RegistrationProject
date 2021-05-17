package com.liferay.registration.web.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.security.audit.storage.model.AuditEvent;
import com.liferay.registration.web.constants.AdminMonitorPortletKeys;
import com.liferay.registration.web.constants.MVCCommandNames;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + AdminMonitorPortletKeys.ADMINMONITOR,
                "mvc.command.name=" + MVCCommandNames.VIEW_REGISTRATION_AUDIT_EVENT,
                //"mvc.command.name=/"
        },
        service = MVCRenderCommand.class
)
public class ViewRegistrationAuditEventMVCRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

        return "/adminmonitor/view_registration.jsp";
    }
}
