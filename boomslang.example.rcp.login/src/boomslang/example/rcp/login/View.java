package boomslang.example.rcp.login;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {
	public View() {
	}
	public static final String ID = "boomslang.example.rcp.login.view";
	public static Button loggedIn;
	
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FormLayout());
		loggedIn = new Button(parent, SWT.CHECK);
		loggedIn.setText("Logged in");
		loggedIn.setEnabled(false);
		FormData fd_button = new FormData();
		fd_button.bottom = new FormAttachment(100, -10);
		fd_button.left = new FormAttachment(0, 10);
		loggedIn.setLayoutData(fd_button);
	}
	
	public static void setLoggedIn(boolean flag) {
		if (loggedIn != null) loggedIn.setSelection(flag);
	}

	@Override
	public void setFocus() {
	}
}