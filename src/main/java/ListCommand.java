public class ListCommand extends Command {
    public static final boolean IS_EXIT = false;

    /**
     * Creates a ListCommand Object to handle user asking for the entire list of tasks.
     */
    public ListCommand() {
        super(IS_EXIT);
    }

    /**
     * Executes the command.
     *
     * @param tasks The entire list of tasks.
     * @param ui Ui object to deal with user interaction.
     * @param storage Storage object to deal with loading tasks from the file and saving tasks in the file.
     * @throws DukeException when there are not tasks in the list.
     */
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        if (tasks.getSize() == 0) {
            throw new DukeException("There are currently no tasks in the list.");
        }

        System.out.println("Here are the task(s) in your list:");

        for (int i = 0; i < tasks.getSize(); i++) {
            Task task = tasks.getTask(i);
            System.out.println((i + 1) + "." + task);
        }
    }
}

