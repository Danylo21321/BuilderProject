public interface Builder {
    Builder startProgram();
    Builder getText(String text);
    Builder finishProgram();
    Builder showText();
    Builder filterPersonAge();
    Builder midelAgePerson();
    Builder peopleWhoWork();
    Builder sortedPeople();
    Builder filterFor(String p);
}
