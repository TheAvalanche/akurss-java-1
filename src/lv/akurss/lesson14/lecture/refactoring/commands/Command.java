package lv.akurss.lesson14.lecture.refactoring.commands;

import java.io.IOException;

public interface Command {
	void execute() throws IOException;
}
