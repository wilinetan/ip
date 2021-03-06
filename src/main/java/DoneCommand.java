public class DoneCommand extends Command {
    public static final boolean IS_EXIT = false;
    protected String input;

    /**
     * Creates a DoneCommand Object to handle checking a task as completed.
     *
     * @param input The input that user types in.
     */
    public DoneCommand(String input) {
        super(IS_EXIT);
        this.input = input;
    }

    /**
     * Executes the command.
     *
     * @param tasks The entire list of tasks.
     * @param ui Ui object to deal with user interaction.
     * @param storage Storage object to deal with loading tasks from the file and saving tasks in the file.
     * @throws DukeException when the input is not valid.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        String[] splitStr = input.split(" ");

        if (splitStr.length == 1) {
            throw new DukeException("☹ OOPS!!! I don't know which task to mark as done.");
        }

        assert splitStr.length == 2 : "Input for Done does not follow the correct format";

        int taskIndex = Integer.parseInt(splitStr[1]) - 1;
        Task updatedTask = tasks.markTaskAsDone(taskIndex);
        storage.updateFile(tasks);

        System.out.println("Nice! I've marked this task as done:\n" + updatedTask);
    }
}
