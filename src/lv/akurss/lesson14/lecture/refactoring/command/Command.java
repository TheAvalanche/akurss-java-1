package lv.akurss.lesson14.lecture.refactoring.command;

public interface Command {
	void execute(String commandStr) throws Exception;
}
