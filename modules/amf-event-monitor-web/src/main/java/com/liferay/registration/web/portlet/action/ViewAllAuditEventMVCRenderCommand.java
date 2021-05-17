package com.liferay.registration.web.portlet.action;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.security.audit.storage.model.AuditEvent;
import com.liferay.registration.web.constants.AdminMonitorPortletKeys;
import com.liferay.registration.web.constants.MVCCommandNames;
import com.liferay.registration.web.portlet.util.AuditEventUtil;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.util.List;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + AdminMonitorPortletKeys.ADMINMONITOR,
                "mvc.command.name=" + MVCCommandNames.VIEW_AUDIT_EVENT,
//                "mvc.command.name=/"
        },
        service = MVCRenderCommand.class
)
public class ViewAllAuditEventMVCRenderCommand implements MVCRenderCommand {
    @Override
    public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {

        return "/adminmonitor/view_all.jsp";
    }
}
