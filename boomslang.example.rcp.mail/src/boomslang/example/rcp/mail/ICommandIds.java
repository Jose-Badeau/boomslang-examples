package boomslang.example.rcp.mail;

/**
 * Interface defining the application's command IDs.
 * Key bindings can be defined for specific commands.
 * To associate an action with a command, use IAction.setActionDefinitionId(commandId).
 *
 * @see org.eclipse.jface.action.IAction#setActionDefinitionId(String)
 */
public interface ICommandIds {

    public static final String CMD_OPEN = "boomslang.example.rcp.mail.open";
    public static final String CMD_OPEN_MESSAGE = "boomslang.example.rcp.mail.openMessage";
    
}
