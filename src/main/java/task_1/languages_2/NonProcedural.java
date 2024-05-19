package task_1.languages_2;

public class NonProcedural extends ProgramLanguage {
    public enum ObjectOriented {CPP, VISUAL_BASIC, DELPHI, JAVA}

    public enum Declarative {
        LOGICAL("PROLOG"),
        FUNCTIONAL("LISP");
        private String name;

        Declarative(String n) {
            name = n;
        }
       public String getName(){
            return name;
        }
    }

}
