public class Parser {

    /**
     * Returns the Command to be executed.
     *
     * @param command The command from the user.
     * @return The Command to be executed.
     * @throws DukeException when the input is not valid.
     */
    public static Command parse(String command) throws DukeException {
        if (command.equals("bye")) {
            return new ByeCommand();
        } else if (command.equals("list")) {
            return new ListCommand();
        } else if (command.contains("done")) {
            return new DoneCommand(command);
        } else if (command.contains("todo")) {
            return new AddTodoCommand(command);
        } else if (command.contains("deadline")) {
            return new AddDeadlineCommand(command);
        } else if (command.contains("event")) {
            return new AddEventCommand(command);
        } else if (command.contains("delete")) {
            return new DeleteCommand(command);
        } else if (command.contains("find")) {
            return new FindCommand(command);
        } else {
            throw new DukeException("☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
        }
    }
}
