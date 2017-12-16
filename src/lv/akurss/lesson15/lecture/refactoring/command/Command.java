package lv.akurss.lesson15.lecture.refactoring.command;

public interface Command {
	void execute(String commandStr) throws Exception;
}
