package lv.akurss.refactoring.command;

public interface Command {
	void execute(String commandStr) throws Exception;
}
