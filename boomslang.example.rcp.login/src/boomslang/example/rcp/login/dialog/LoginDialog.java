package boomslang.example.rcp.login.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.ShellListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class LoginDialog extends Dialog {
	private Text password;
	private Text username;
	private static boolean loggedin;

	public static boolean isLoggedin() {
		return loggedin;
	}

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public LoginDialog(Shell parentShell) {
		super(parentShell);
		loggedin = false;
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Login");
	}

	@Override
	public boolean close() {
		if (loggedin) return super.close(); else return false;
	}
	
	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(3, false));
		
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblUsername = new Label(container, SWT.NONE);
		lblUsername.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUsername.setText("Username");
		
		username = new Text(container, SWT.BORDER);
		GridData gd_username = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_username.widthHint = 171;
		username.setLayoutData(gd_username);
		new Label(container, SWT.NONE);
		
		Label lblPassword = new Label(container, SWT.NONE);
		lblPassword.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblPassword.setText("Password");
		
		password = new Text(container, SWT.BORDER | SWT.PASSWORD);
		GridData gd_password = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_password.widthHint = 172;
		password.setLayoutData(gd_password);
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button loginButton = createButton(parent, IDialogConstants.NO_ID, "Login", true);
		loginButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String p = password.getText();
				String u = username.getText();
				if (p != null && p.equalsIgnoreCase("admin") && 
					u != null && u.equalsIgnoreCase("admin")) {
					MessageDialog.openInformation(parent.getShell(), "Login successful!", "You are loged in!");
					loggedin = true;
					close();
				} else {
					MessageDialog.openError(parent.getShell(), "Login error!", "Could not login!");
				}
			}
		});
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(272, 178);
	}

}
