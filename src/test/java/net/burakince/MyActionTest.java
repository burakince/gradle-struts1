package net.burakince;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyActionTest {

    @Mock
    private ActionMapping mapping;
    @Mock
    private ActionForm form;
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;

    private MyAction myAction;

    @Before
    public void setUp() {
        myAction = new MyAction();
    }

    @Test
    public void whenGetSuccessParameterShouldForwardSuccessPage() throws Exception {
        when(request.getParameter("success")).thenReturn("OK");

        myAction.execute(mapping, form, request, response);

        verify(mapping).findForward("success");
    }

    @Test
    public void whenNotGetSuccessParameterShouldForwardFailurePage() throws Exception {
        when(request.getParameter("success")).thenReturn(null);

        myAction.execute(mapping, form, request, response);

        verify(mapping).findForward("failure");
    }

}
